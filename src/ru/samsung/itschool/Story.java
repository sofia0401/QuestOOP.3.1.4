package ru.samsung.itschool;

import java.util.Scanner;

public class Story {

	private Situation start_story;
	public Situation current_situation;

	Story() {
		start_story = new Situation(
				"первый выбор",
				"Выберите институт:\n"
						+ "(1)кибернетика\n"
						+ "(2)ИТ\n"
						+ "(3)ФТИ ",
				3, 0, 0, 0);
		start_story.direction[0] = new Situation(
				"bad",
				"кибы сосатб",
				0, 0, -10, -10);
		start_story.direction[1] = new Situation(
				"best",
				"отличный выбор",
				0, 1, -100, 0);
		start_story.direction[2] = new Situation(
				"press f to pay respect",
				"земля пухом", 0, 0,
				500, 1);
		current_situation = start_story;
	}

	public void go(int num) {
		if (num <= current_situation.direction.length)
			current_situation = current_situation.direction[num - 1];
		else
			System.out.println("Вы можете выбирать из "
					+ current_situation.direction.length + " вариантов");
	}

	public boolean isEnd() {
		return current_situation.direction.length == 0;
	}
}