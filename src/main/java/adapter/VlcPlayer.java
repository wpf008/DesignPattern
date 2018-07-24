package adapter;

/**
 * @Author:pengfei
 * @Description
 * @Date:Created in 14:00 2018/7/24
 * @Modified by
 */
public class VlcPlayer implements AdvanceMediaPlay {//vlc专属播放器
    public void playMp4(String fileName) {

    }

    public void playVlc(String fileName) {
        System.out.println("paly vlc"+fileName);
    }
}
