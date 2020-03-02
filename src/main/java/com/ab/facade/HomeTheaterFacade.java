package com.ab.facade;

import javafx.scene.shape.SVGPath;

/**
 * @author ab
 * @description
 * @date
 */
public class HomeTheaterFacade {
    /**
     * 定义各个子系统对象
     */
    private TheaterLight theaterLight;
    private Popcorn popcorn;
    private Stereo stereo;
    private Screen screen;
    private DVDPlayer dvdPlayer;
    private Projector projector;


    /**
     * 构造器
     *
     */

    public HomeTheaterFacade(){
        this.projector = Projector.getInstance();
        this.theaterLight = TheaterLight.getInstance();
        this.popcorn = Popcorn.getInstance();
        this.stereo = Stereo.getInstance();
        this.screen = Screen.getInstance();
        this.dvdPlayer = DVDPlayer.getInstence();
    }

    /**
     * 操作分成4步
     */
    public void ready() {
        theaterLight.on();
        popcorn.on();
        stereo.on();
        screen.on();
        dvdPlayer.on();
    }

    public void play() {
        dvdPlayer.play();
    }

    public void pause() {
        dvdPlayer.pause();
    }

    public void end() {
        popcorn.off();
        popcorn.pop();
        screen.up();
        projector.on();
    }



}
