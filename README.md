# EDEPS
Elite Dangerous Engineering Procurement System - Alpha (Working Title)

I play a lot of Elite: Dangerous, and I wanted to try my hand at building an app, similar to (the very useful) EDEngineer (https://github.com/msarilar/EDEngineer) but more tailored to my personal needs and tastes, and written in Java (using JavaFX as the UI framework). 

The core focus, at least right now is a working proof-of-concept app that provides helpful functionality, geared mostly toward planning out engineering focused ship builds. The main component of the app is a "procurements" list, from which the user can select various craftable items in the game. Each craftable item that is selcted creates a "task" in the "task list", and for each task, the materials and/or commodites required are added to a "needed items" list.

For each planned task, there is a counter that can be incremented or decremented to "order" more of the desired item. The "needed items" list is calculated by multiplying the counts of each task by the number of compenets required to craft one of the desired items. Effectively, this is more or less a special purpose spreadsheet :-) For right now, that's really all this is, though i'm rapdily finding myself adding little bits of funcionality as I go. 

At the moment, the app more or less "works" though there are admiteddly some minor bugs. At the moment, All of the available crafting items are supported (i think). This includes all Synthesis recipes, engineering mods, experimental effects, and technology broker items. For every "recipe" in each of these categories, the effects and costs were extracted from the emeinently useful INARA Elite Dangerous Companion (https://inara.cz/). I have notcied a few discrepencies between the values from INARA and the actual in-game items, so there is still some work to be done to correct these discrepancies. 

I also plan to add a "current ship loadout" tab to the app that lists in full detail, every statistic of your current ship, including all modifications and experiemental effects and the degree and value fo the changes they have on the stock components.
