package com.isep.utils;

import java.util.ArrayList;
import com.isep.rpg.*;
import com.isep.rpg.hero.*;
import com.isep.rpg.item.*;
import com.isep.utils.scenecontrollers.*;

import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;

public class GUIParser extends Application implements InputParser
{
    private int heroNumber = 1;
    @Override
    public void start(Stage stage) throws IOException
    {
        // -_-_-_-_-_-_-_-_-_- load the fxml scene -_-_-_-_-_-_-_-_-_-
        StageLoader.setStage(stage);
        StageLoader.loadFXMLScene("/data/scenes/welcomeMenu.fxml");
    }

    public void launchInterface()
    {
        launch();
    }

    public int getHeroNum()
    {
        boolean end = false;
        while(!end)
        {
            StageLoader.sleep(500);
            end = StageLoader.choiceEnd;
        }
        StageLoader.choiceEnd = false;
        return StageLoader.herosNumber;
    }

    public Hero getHeroClasse()
    {
        switch(this.heroNumber)
        {
            case 1:
                this.heroNumber = 2;
                return StageLoader.hero1;
            case 2:
                this.heroNumber = 3;
                return StageLoader.hero2;
            case 3:
                this.heroNumber = 4;
                return StageLoader.hero3;
            case 4:
                this.heroNumber = 5;
                return StageLoader.hero4;
        }

        return null;
    }

    public int getAction(Hero hero, int size)
    {
        boolean end = false;
        while(!end)
        {
            StageLoader.sleep(500);
            end = StageLoader.choiceEnd;
        }
        int choice = StageLoader.action;
        return choice;
    }

    public void chooseSpell(SpellCaster hero)
    {
        // do nothing, spell choice is made using events
    }

    public void chooseWeapon(Hero hero)
    {
        // do nothing, weapon choice is made using events
    }

    public int getTarget(ArrayList<Combatant> targets)
    {
        System.out.println(StageLoader.currentEnemy);
        String c;
        if(targets.get(0) instanceof Hero)
            c = StageLoader.currentTarget;
        else
            c = StageLoader.currentEnemy;
        int choice;
        for (Combatant target : targets) {
            if (target.getName().equals(c)) {
                choice = targets.indexOf(target);
                StageLoader.choiceEnd = false;
                return choice;
            }
        }
        return -1;
    }

    public int chooseItem(ArrayList<Consumable> consumables)
    {
        String c = StageLoader.consumable2use;
        int choice;
        for (Consumable consumable : consumables)
        {
            if (consumable.getName().equals(c))
            {
                choice = consumables.indexOf(consumable);
                StageLoader.choiceEnd = false;
                return choice;
            }
        }
        return -1;
    }

    public void waitKey()
    {
        StageLoader.player += 1;
    }
}