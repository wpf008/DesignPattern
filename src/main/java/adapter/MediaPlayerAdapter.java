package adapter;

/**
 * @Author:pengfei
 * @Description
 * @Date:Created in 14:01 2018/7/24
 * @Modified by
 */
public class MediaPlayerAdapter implements MediaPlay {//播放器适配器

    public AdvanceMediaPlay advanceMediaPlay;

    public MediaPlayerAdapter(String type){
        if(type.equals("mp4")){
            advanceMediaPlay=new Mp4Player();//如果是MP4文件就初始化MP4播放器
        }else if(type.equals("vlc")){
            advanceMediaPlay = new VlcPlayer();//如果是VLC文件就初始化VLC播放器
        }
    }



    public void play(String type, String fileName) {
        if(type.equals("mp4")){
            advanceMediaPlay.playMp4(fileName);//播放MP4
        }else if(type.equals("vlc")){
            advanceMediaPlay.playVlc(fileName);//播放vlc
        }else {
            System.out.println("Invalid media. "+
                    type + " format not supported");
        }
    }
}
