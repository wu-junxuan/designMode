package com.wujunxuan.state;



public class CourseVideoContext {

    private CourseVideoState courseVideoState;
    public final static PlayState PLAY_STATE=new PlayState();
    public final static PauseState PAUSE_STATE=new PauseState();
    public final static SpeedState SPEED_STATE=new SpeedState();
    public final static StopState STOP_STATE =new StopState();
    public CourseVideoState getCourseVideoState(){
        return courseVideoState;
    }
    public void setCourseVideoState(CourseVideoState courseVideoState){
        this.courseVideoState=courseVideoState;
        //important
        this.courseVideoState.setCourseVideoContext(this);
    }
    public void play(){this.courseVideoState.play();}
    public void pause(){this.courseVideoState.pause();}
    public void speed(){this.courseVideoState.speed();}
    public void stop(){this.courseVideoState.stop();}


}
