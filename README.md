Usage Guide: https://github.com/controllerface/CMDR-J/wiki/Usage-Guide

# CMDR J

Commander J (CMDR_J) is a companion app for the video game `Elite : Dangerous`. Initially I started working on this app as an exercise to expand my development chops from just back-end code to something more front-end (with a GUI). Being aware of the Journal API from several other similar apps, and the Frontier forums I chose this project as it seemed like a good fit for a weekend hobby.

My main goal with this app is to make an attempt and addressing some shortcomings of the game when it comes to task planning, and specifically engineering and upgrading your ship. To this end I created a **Tasks** panel that contains various activities you have "planned" to do by adding tasks in other parts fo the app, primarily the **Loadout** and **Inventory** tabs. When building out this capacity, I was mostly focused on engineering and as such the individual material controls contain "Trade" tasks that can be used to plan trades of materials you are full of, for those you don't have enough of.  

Secondarily, I wanted to make working with guardian sites and other ground-based activities a little easier. For this I added a mini-map in the **Navigation** panel. This map is active only when on the surface of a planet. The map is centered on the player, with a rotating arrow indicating the player's current heading. The map has a "Waypoint" feature, which can be used to set a marker at your current location. The marker can be named, for ease of use when travelling between points. Most notably, this is useful at guardian sites as you can mark the towers. As long as the app is still running, the waypoints will remain through a re-log if needed.

Over time I also added a few bits to the UI like some **Market** data, and a **Log** panel which shows the last 500 or so journal messages that have been processed by the app. 

I will probably continue to add and flesh out things as I find time and energy.

##### Current Status

While I still consider the app more or less "late alpha" most major bugs have been ironed out as I have tested the app by using it to engineer several ships. There may still be a handful of copy-paste or similar error with some stats on modules, but any such issues are easy to fix when spotted. Initially developed in Java 8/JavaFX8, the app has been ported to JDK 11, and is built and developed with `GraalVM` and the `Gluon Substrate` native binary tools.

As I do still have some basic features I want to add but have not done so yet, I will add `todo:` notes to point some out for my own reference :-) 


### Overview

The UI consists of several tabbed panels, with categories of functionality grouped together, below is a general outline of how each tab is currently functioning. Each tab generally has one or more sub-tabs which further breakdown the tab's relevant information.

* **Loadout**
This tab contains information about your current ship's installed modules, as well as some helpful information about your overall defensive capabilities. `todo: add offensive and mass/speed sub-tabs`. For the installed modules, you can see the currents stats of the module, and where applicable, see what other modules you _could_ have in that slot instead. You can also check out all the mods and experimental effects that may be available for the module. Should you decide you want to get a new module, or add a mod/experimental effect, you can add those as tasks and they will show up in the "Task" tab. `note: there are still a few in-development sub-tabs in the section`  

* **Inventory**
If you have cargo in your ship, or are carrying any materials, they will be listed here. For materials, you can expand any items and see what trades can be made. If you find yourself with a surplus of some very common material, this can be helpful for planning out a mat-trading run where you can see ahead of time what exactly you can get without needed to go all the way to the mat trader, or calculating the numbers by hand. `todo: cargo items need location data fleshed out` 

* **Market**
When you have docked at a station and loaded the commodities market, this tab will show you two lists, imports and exports. The imports list (top) shows you the commodities that this station will buy from you along with the price per unit and some stats about how much above/below galactic average the price is. `todo: query a datasource for more competitive analysis`  

* **Navigation**
Useful primarily when prospecting or otherwise navigating around on planets. This tab contains a mini-map and a simple "Waypoint" interface that allows you to mark your current location with a name, making it easy to return later. Note that waypoints are not persistent across reloads of the app. `todo: expand the waypoint system to be persistent and unique to each planetary body`

* **Tasks**
Consisting of two sections, this tab shows you the tasks you have planned, as well as the items required for carry them out. The upper list is the "Task list", the lower is the "Items list". When you add a task, (like a trade or a module purchase) from a different tab in the app, it will show up in the upper list. All tasks that are added to this list contain one or more "costs" required to actually perform the task. For a module purchase, the cost will be some number of credits, for a modification it will be materials. The sum total of all costs from the upper list is displayed in the lower list. 

When you are short a material in the Items list, the gauge in the right most column will be red and a number will be shown in the "need" column indicating how many more of this item you need to be able to complete the associated tasks. Once you have ensured that all of the items in the item list have been procured, you can perform all the tasks in the upper task list. 

As you perform the tasks, the app will keep track of your commander journal events and remove the tasks from list automatically. `todo: this may have some bugs still`  

* **Log**
Finally, more or less just for debugging/informational purposes, we have the "Log" tab, which shows the last 500 journal messages that have been processed. Note that some events will result in more than one message line in the log, the 500 cap is per line, so there may be fewer than 500 events worth of history. `todo: some journal events do not result in log messages at the moment, mostly due to them being very "noisy". Should add a verbostiy level as well as perhaps expose the maximum message history cap`   
