package adapter;

/**
 * @Author:pengfei
 * @Description
 * @Date:Created in 13:59 2018/7/24
 * @Modified by
 */
public class Mp4Player implements AdvanceMediaPlay {//MP4专属播放器
    public void playMp4(String fileName) {
        System.out.println("paly mp4"+fileName);
    }

    public void playVlc(String fileName) {

    }
}
