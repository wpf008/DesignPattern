package adapter;

/**
 * @Author:pengfei
 * @Description
 * @Date:Created in 14:05 2018/7/24
 * @Modified by
 */
public class AudioPlayer implements MediaPlay{//对外开放的播放器接口
    MediaPlayerAdapter mediaPlayerAdapter;
    public void play(String type, String fileName) {
       if(type.equals("vlc") || type.equals("mp4")){
            mediaPlayerAdapter = new MediaPlayerAdapter(type);
            mediaPlayerAdapter.play(type,fileName);
        }else {
            System.out.println("Invalid media. "+
                    type + " format not supported");
        }
    }
}
