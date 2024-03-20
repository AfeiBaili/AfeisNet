package frame.list;

import logger.Logger;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class ReadAvatar {
    public String path;
    public Image avatar;

    public ReadAvatar(String path) {
        this.path = path;
        try {
            avatar = ImageIO.read(new File(path));
        } catch (IOException e) {
            try {
                avatar = ImageIO.read(new File("resource/FLIcon_A.png"));
            } catch (IOException ex) {
                Logger.outErr("找不到默认头像");
            }
        }

    }
}
