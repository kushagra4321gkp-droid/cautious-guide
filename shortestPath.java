import java.util.*;
public class shortestPath {
    public static int find_displacement(String path){
        int s = 0,w = 0,n = 0,e = 0,dis = 0,x = 0,y = 0;
        for(int i = 0; i<path.length(); i++){
            if(path.charAt(i) == 'W'){
                w++;
            }else if(path.charAt(i) == 'E'){
                e++;
            }else if(path.charAt(i) == 'N'){
                n++;
            }else if(path.charAt(i) == 'S'){
                s++;
            }
        }
        x = e - w;
        y = n - s;
        return dis = (int)Math.sqrt((x*x)+(y*y));
    }
    public static void main(String[] args) {
        String path = "WNEENESENNN";
        System.out.print("shortest path is : " + find_displacement(path));
    }
}