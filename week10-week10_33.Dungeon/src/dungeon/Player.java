/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeon;

/**
 *
 * @author Michele Gelvoleo
 */
public class Player{
    public int x;
    public int y;
    public int length;
    public int height;
    
    public Player(int length, int height){
        this.x = 0;
        this.y = 0;
        this.length = length - 1;
        this.height = height - 1;
    }
    
    public void command(char command){
        if(command == 'w'){
            if(this.y > 0){
                this.y--;
            }
        }else if(command == 's'){
           if(this.y < this.height){
               this.y++;
           }
        }else if(command == 'a'){
            if(this.x > 0){
                this.x--;
            }
        }else if(command == 'd'){
            if(this.x < this.length){
                this.x++;
            }
        }
    }
    
    @Override
    public String toString(){
        return "@" + " " + this.x + " " + this.y;
    }
    
    public String coordinates(){
        return this.x + "x" + this.y + "y";
    }

}
