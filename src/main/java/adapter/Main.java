package adapter;

/**
 * @Author:pengfei
 * @Description 适配器设计模式
 * @Date:Created in 14:04 2018/7/24
 * @Modified by
 */

public class Main {

    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("vlc","www.vcl");
        audioPlayer.play("mp4","xxx.mp4");
        audioPlayer.play("avi","yyy.avi");
    }
}
