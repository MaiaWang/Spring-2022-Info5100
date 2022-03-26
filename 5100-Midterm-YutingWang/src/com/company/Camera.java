package com.company;

public class Camera {
    private Camera(){}

    public String getCameraName() {
        return cameraName;
    }

    public void setCameraName(String cameraName) {
        this.cameraName = cameraName;
    }

    private static  Camera _instance;

    private static Object obj = new Object();
    private String cameraName = "";
    public static Camera getInstance(){

        if(_instance == null){
            synchronized (obj){
                if(_instance == null){
                    _instance = new Camera();
                }
            }
        }

        return _instance;
    }
    public static void main(String[] args) {
        Camera cam1 = Camera.getInstance();

        cam1.setCameraName("Camera 1");

        Camera cam2 = Camera.getInstance();
        System.out.println(cam1.getCameraName());
        System.out.println(cam2.getCameraName());

        cam2.setCameraName("Camera 2");
        System.out.println(cam1.getCameraName());
        System.out.println(cam2.getCameraName());
    }

}
