package _02_boolean._5_googly_eyes;

import processing.core.PApplet;
import processing.core.PImage;

/*
 * Goal: Put googly eyes on a face!
 * 
 * Instructions:
 * 1. Find an image on the Internet and drop it into the /images folder at the
 *    top level of this module. It can be anything as long as it has large eyes!
 * 
 * 2. Declare a variable for the image:
 */  
 
 
 /* 3. In your setup() method, import your image using the following code:
 *    face = loadImage("face.jpg");
 * 
 * 4. Resize your face image to the size of the window using the resize() method.
 * 
 * 5. In the draw() method, place a white ellipse over the left eye of your image.
      HINT: To find out where to put it, add code to print the mouseX and
      mouseY where you click the mouse.
 *
 * 6. Now add a pupil (the black part) to the left eye.
 * 
 * 7. Use mouseX and mouseY to move the left pupil where the mouse moves.
 * 
 * 8. Repeat the same steps for the right eye.
 * 
 * 9. Add a right pupil and make it move by using
 *    mouseX + [distance from left eye] and mouseY + [distance from left eye].
 * 
 * 10.Here’s the tricky part: stop the pupils from going outside of the white
 *    circles! To do this, imagine a rectangle that the pupil should stay
 *    within. When mouseX and mouseY goes outside of these bounds, set it back
 *    to the boundary. Put this code before you draw the pupils.
 */
public class GooglyEyes extends PApplet {
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    
    PImage face;
    int lastX = 367;
    int lastY = 119;
    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }
    
    @Override
    public void setup() {
    	face = loadImage("images/Shedletsky.png");
    	face.resize(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
    	background(face);
    	if(mousePressed){
    		System.out.println(mouseX + " "+ mouseY);
    	}
    	fill(255,255,255);
    	ellipse(367,119,40,40);
    	ellipse(406,119,40,40);
    	fill(0,0,0);
    	if(Math.sqrt(Math.pow(mouseX-367,2)+Math.pow(mouseY-119, 2)) <13) {
    	ellipse(mouseX,mouseY,20,20);
    	ellipse(mouseX +43,mouseY + 2,20,20);
    	lastX = mouseX;
    	lastY=mouseY;
    	}else {
   
    		ellipse(lastX,lastY,20,20);
    		ellipse(lastX+43,lastY+2,20,20);
    	}
    }
//370,112
//413,110
    static public void main(String[] args) {
        PApplet.main(GooglyEyes.class.getName());
    }
}
