package ru.samsung.itschool;
import java.util.Scanner;
public class Game {

	public static Character manager;
	public static Story story;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Вы попали в МИРЭА. \n "+"Осталось уладить формальности - Введите ваше имя:");
		manager = new Character(in.next());
		story = new Story();
		while (true) {
			manager.A += story.current_situation.dA;
			manager.K += story.current_situation.dK;
			manager.R += story.current_situation.dR;
			System.out.println("=====\nБаллы:" + manager.K + "\tДолги:"+manager.A + "\tЗачеты:" + manager.R + "\n=====");
			System.out.println("============="+story.current_situation.subject + "==============");
			System.out.println(story.current_situation.text);
			if (story.isEnd()) {
				System.out.println("====================the end!===================");
				return;
			}
			story.go(in.nextInt());
		}
	}
}
