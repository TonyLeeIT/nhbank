package nhbank.core.util;

import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.Session;
import net.schmizz.sshj.SSHClient;
import net.schmizz.sshj.sftp.SFTPClient;
import net.schmizz.sshj.transport.verification.PromiscuousVerifier;
import net.schmizz.sshj.xfer.FileSystemFile;
import nhbank.core.controllers.NHBankController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;

public class SftpUtils {
    public static final Logger logger = LoggerFactory.getLogger(NHBankController.class);

    public void getFilesSftp(String SFTPHOST, String SFTPUSER, String SFTPPASS, String SFTPWORKINGDIR, String SFTPREMOTE) throws IOException {
        Session session = null;
        Channel channel = null;
        ChannelSftp channelSftp = null;
        SSHClient sshClient = null;
        try {
            sshClient = setupSshj(SFTPHOST, SFTPUSER, SFTPPASS);
            SFTPClient sftpClient = sshClient.newSFTPClient();
            sftpClient.get(SFTPREMOTE, new FileSystemFile(SFTPWORKINGDIR));
        } catch (Exception ex) {
            ex.printStackTrace();
            logger.error("SFTP : " + ex.getMessage());
        } finally {
            if (sshClient != null) sshClient.disconnect();
        }

    }

    public void putFileSftp(String SFTPHOST, String SFTPUSER, String SFTPPASS, File file, String SFTPREMOTE) throws IOException {
        Session session = null;
        Channel channel = null;
        ChannelSftp channelSftp = null;
        SSHClient sshClient = null;
        try {
            sshClient = setupSshj(SFTPHOST, SFTPUSER, SFTPPASS);
            SFTPClient sftpClient = sshClient.newSFTPClient();
            sftpClient.put(new FileSystemFile(file), SFTPREMOTE);
        } catch (Exception ex) {
            ex.printStackTrace();
            logger.error("SFTP : " + ex.getMessage());
        } finally {
            if (sshClient != null) sshClient.disconnect();
        }
    }

    private SSHClient setupSshj(String SFTPHOST, String SFTPUSER, String SFTPPASS) throws IOException {
        SSHClient client = new SSHClient();
        try {
            client.addHostKeyVerifier(new PromiscuousVerifier());
            client.connect(SFTPHOST);
            client.authPassword(SFTPUSER, SFTPPASS);
        } catch (Exception e) {
            e.printStackTrace();
            logger.error(e.getMessage());
        }
        return client;
    }
}
