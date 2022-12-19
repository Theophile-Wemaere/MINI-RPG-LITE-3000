# MINI RPG LITE 3000

### RPG implementation in java using OOP and graphical interface (javafx)

#### What is it ?

This code is my version of a Role Playing Game (or RPG) using java.
The context was my algorithms and programming courses during my first year of engineer cycle in ISEP school, Paris.

The global structure was made using the following UML :

![UML](/imgs/UML.png)

I modified the package structure a bit, here is the updated UML :

![UML-2](/imgs/UML-2.png)

Here are some images of the game :

![image 1](/imgs/screenshot1.png)

![image 2](/imgs/screenshot2.png)

Normally, I've added maven support so It should run on all main stream IDE like IntelliJ or Eclipse

#### Sources

_"Rendre à César ce qui est à César"_

Even if i'm not gonna use this game for commercials purposes, here are the sources to the images / gifs / musics I've used in this game.

```
GIF for heros :
https://www.pinterest.jp/pin/616359899018840415/
https://www.pinterest.com.mx/pin/326229566749447817/
https://www.pinterest.ca/pin/502714377145413366/
https://www.pinterest.jp/pin/19210735902310386/

GIF and imgs for enemies :
https://br.pinterest.com/pin/486740672234858076/
https://www.pinterest.com/pin/367465650842015921/
https://www.pinterest.co.kr/pin/474918723200119901/
https://bestanimations.com/Animals/Insects/Spiders/spider-animated-gif-3.gif
https://i.redd.it/dilm5h6ljar91.png

Diverses icon :
https://www.pinterest.com/pin/893894226012549037/ (bagpack)
https://www.pinterest.com/pin/stylised-gravestone-javier-fernandez--406027722637557635/ (grave)
https://pixeljoint.com/files/icons/full/whole_set.png
https://www.freeiconspng.com/img/32143

Backgrounds :
https://imgur.com/gallery/pTwKVqo
https://www.pinterest.com/pin/36169603243444555/
https://br.pinterest.com/pin/707557791438296232/
https://www.spriters-resource.com/mobile/heroessaga/sheet/73775/
https://www.spriters-resource.com/mobile/heroessaga/sheet/73774/

```

#### Dev notes

```
todo : 
    handle no int input
    add mana regen
    add consumables after each kill
    error when no more mana:
    Careful, Elrond doesn't have enough mana to use spells
    Please select a spell first to attack
UML modified :
    Hero and every child of Hero are in the com.isep.rpg.hero
    Item and every child of Item are in the com.isep.rpg.item
    added Magie


every hero has 4HP

warrior as 5 defense
hunter has 4 defense
spellcaster have 3 defense

mage has 7 mana
healer has 8 mana

giant sword and crossbow = 3 damage
saber and bow = 2 damage

ice pick = 2 damage
lightning = 3 damage
fire storm = 5 damage
holy ray = 2 damage

every enemy has 5 HP and between 5 and 7 defense
the boss has 10HP and 10defense
```
