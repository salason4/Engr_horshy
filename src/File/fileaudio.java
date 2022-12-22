 package File;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class fileaudio {
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        Scanner scanner = new Scanner(System.in);

        File file = new File("C:\\Users\\HP.COM\\Downloads\\9ice-Abefe-Prod.-By-Olumix.wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);

        String response = "";
        while (!response.equals("Q")){
            System.out.println("P =Play, S = Stop, R = Reset, Q= quit");
            System.out.print(" Enter your choice: ");
            response = scanner.next();
            response = response.toUpperCase();
            switch (response){
                case ("P"): clip.start();
                break;
                case ("S"): clip.stop();
                break;
                case ("R"): clip.setMicrosecondPosition(0);
                break;
                case ("Q"): clip.close();
                break;
                default:System.out.println(" not a valid response");
            }

         }
        System.out.println("Byeeeee!");
    }
}

