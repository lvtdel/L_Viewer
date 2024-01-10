import remote.BLL.HomeBLL;
import remote.BLL.rmi.IRemoteDesktop;
import remote.BLL.rmi.RmiClient;
import remote.BLL.rmi.RmiServer;
import remote.GUI.HomeUi;
import remote.GUI.RemoteScreenForm;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;

public class Application {
    public static void main(String[] args) throws Exception {
//        RmiServer rmiServer = new RmiServer();
//        try {
//            rmiServer.startBindingOnRmiServer("localhost", 1111);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        RmiClient rmiClient = new RmiClient();
//        try {
//            rmiClient.startConnectingToRmiServer("localhost", 1111);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        IRemoteDesktop remoteDesktop = rmiClient.getRemoteObject();
//        remoteDesktop.mouseMovedServer(0.5, 0.5);
//        RemoteScreenForm remoteScreenForm = new RemoteScreenForm();
//        Image originImage = ImageIO.read(new File("D:\\Pictures\\Picture2.png"));
//
//        ImageIO.setUseCache(false);
//        while (true) {
//            byte[] dgram = remoteDesktop.takeScreenshotServer("jpg");
//            ByteArrayInputStream bis = new ByteArrayInputStream(dgram);
//            BufferedImage screenshot = ImageIO.read(bis);
//
//            remoteScreenForm.setScreenImage(screenshot);
//
////            Thread.sleep(1000/60);
//            Thread.sleep(1000/30);
//        }

//        remoteDesktop.keyPressedServer(KeyEvent.VK_A);

//        new HomeBLL(new RmiServer());

        HomeUi.getInstance().showWindow();
    }
}
