package _07_riddler;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
int score=0;
String response;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
response=JOptionPane.showInputDialog("Can you name three consecutive days without using the words Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, or Sunday.");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
if(response.equals("yesterday,today,and tomorrow")){
	score++;
	JOptionPane.showMessageDialog(null, "correct");
}else {
	JOptionPane.showMessageDialog(null, "nope sorry you got it wrong");
}

		// 5. Otherwise, say "wrong" and tell them the answer
// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
response=JOptionPane.showInputDialog("what belongs to you,but other people use it more than you?");
// 4. If they got the answer right, pop up "correct!" and increase the score by one
if(response.equals("your name")){
score++;
JOptionPane.showMessageDialog(null, "correct");
}else {
JOptionPane.showMessageDialog(null, "nope sorry you got it wrong");
}
		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
		
	}
}

