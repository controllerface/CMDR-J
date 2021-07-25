Usage Guide: https://github.com/controllerface/CMDR-J/wiki/Usage-Guide

# CMDR J

Commander J (CMDR_J) is a companion app for the video game `Elite : Dangerous`. I work on it mainly for myself and a few friends in my spare time. 

### Current Status: Alpha

There is a **known issues** section at the bottom of this document listing the things I am aware of and will work on when I get time. 

Currently, the project is in what I consider an **alpha** state, which despite being several years old, I still consider correct for the following reasons:

- I do not consider it feature-complete, I tend to add things to the app on a whim and still have things I want to add.

- I Will sometimes change how the internal data structure works in the database as I add features, and this may require wiping all data and starting over, and I am not yet ready to commit to migration strategy when doing changes like this. 

- I don't take this project _too_ seriously. And if it never gets "done" I'm OK with that.
 
That said, I use it for myself, and will make every attempt to ensure it at least functions within the scope of features I have implemented. I will generally make releases only once I've finished up a new feature or at least cleaned up and added placeholder code where necessary to avoid issues with in-development features. So the binary releases should function properly.

Anyway, I find it useful, so if you do too, awesome!


### Key Features
* Task Tracking
  * You can select tasks that you can track. A task is more or less something you can do in-game. For example there are tasks for purchasing modules, modifying them, upgrading personal weapons and suits, synthesis, etc.
  * All tasks have associated costs. When a task is tracked, its associated costs are also tracked. The cumulative costs of all tracked tasks are listed together.  
* Planetary GPS
  * When on a planet, a small map is rendered in the appropriate tab. This map has a mixture of automatically set and manually set waypoints. The waypoints are listed, and a single waypoint can be marked for tracking. When tracked, the bearing you should be headed is present in the UI. 
* Galactic Tracking and Custom POIs
  * When travelling to new systems, your exploration data is automatically cataloged and searchable. In the catalog UI, you can write text notes and attach them to star systems.
* Web App Implementation
  * The UI is a standard Web App, and loads from `localhost:9000` in your browser. 
  * This makes it possible to optionally serve on your LAN/Wi-Fi and access from a tablet or other device on your home network.
    * Local network access must be enabled manually by setting an inbound rule in your windows firewall settings, but you do not need to open your computer to the wider internet.

### UI Overview

The UI consists of several tabbed panels, with categories of functionality grouped together, below is a general outline of how each tab is currently laid out. Each tab generally has one or more sub-tabs which further breakdown the tab's relevant information.

* **Commander:** Information about your Commander including stats, inventory, and reputation.
  
  * **Inventory:** Materials and Goods you own.
    
    * **Materials:** Ship-based materials.
    
      * **Raw**
      
      * **Encoded**
      
      * **Manufactured**
    
    * **Storage:** On-Foot materials.
      
      * **Assets**
      
      * **Goods**
      
      * **Data**
      
      * **Consumables**
  
  * **Politics:** Local and Galaxy-wide faction standings. Will display information on conflicts in the current system if there are any ongoing.
  
  * **Engineers:** Your reputation and progress with all known knownEngineers.
  
  * **Statistics:** Historical data about your game play activity.

* **Spacesuit:** Data about your currently quipped space suit and gear.
  
  * **Suit:** Information about your suit.
  
  * **Weapons:** Information about your equipped weapons.

* **Starship:** Detailed information about your current ship, if you own one and are currently on board.
  
  * **Loadout:** Details about all currently equipped modules.
    
    * **Core Internals**
    
    * **Optional Internals**
    
    * **Hardpoints:** Includes weapon and utility mounts.
  
  * **Cargo:** Manifest of any cargo you have on board.
  
  * **Systems Analysis:** Useful statistics about your current ship configuration.
    
    * **Offense:** Shows your overall DPS as well as a breakdown of damage types
    
    * **Defense:** Includes calculated resistance values taking into account diminishing returns, provides some guidance for min-maxing. 
    
    * **Power Usage:** List of power draw by modules, sorted by highest draw first.
  
  * **Statistics:** The stock stats of your ships hull as well as come calculated stats provided by the game.

* **Markets:** Shows the current market information if you are docked and have loaded the commodities list, but also allows you to search your own personal history for markets that sell specific commodities, modules, or ships.
  
  * **Current:** Data about the market at the currently docked station, if you are docked. Information about a specific station or settlement is stored and updated automatically as the game is played. Simply load the commodity market, outfitting, and shipyard menus at your current station to ensure the latest data is always saved.
    
    * **Commodities**
    
    * **Outfitting**
    
    * **Shipyard** 
 
 * **Search:** Provides a simple search box that can be used to locate items. Note that you will need to have docked somewhere that sells and item before your search will ever return results.  
 
* **Navigation:** Tools for viewing and recording data about places you have been or are currently.
  
  * **Current System:** If you have scanned any bodies in a system, this will show them. When exploring, using FSS and DSS will add more information to this display. If you have saved any manual points of interest notes, they will be displayed in a drop-down menu.
  
  * **Hyperspace Route:** If you have a route currently plotted on the galaxy map, it will be displayed here, and will include the star types and relative distance of each system in the route.
  
  * **System Catalog:** Provides a simple search box that can be used to search your personal exploration history for a specific system. All systems you have ever visited (while the app was running) are listed in alphabetical order in a filterable drop-down menu for ease of use.
  
  * **Planetary GPS:** While on the surface of a planet, either landed, in an SRV or on foot, this tab will give you a crude local map that tracks your location. Some notable points are automatically marked, like the closest settlement, or the last known location of your ship if you have disembarked. In addition, you can click a "mark location" button in the UI to set a waypoint at your current location. Waypoints can be renamed to make them more useful. Once set, waypoints will persist across play sessions and are saved even after you leave the planet. In this sense, they function as a form of planetary bookmark.  
  
* **Activities:** If you have any missions or are participating in any community goals, their details will be displayed within sub-tabs. In addition, there is a categorized list of tasks that require credits and/or resources that can be planned and tracked.
  
  * **Tasks:** Self-selected tasks are displayed as well as cumulative "shopping list" that tracks the amount of each item you need to perform tracked tasks. 
    
    * **In Progress:** Lists all currently tracked tasks. Each task has an adjustable counter in case you want to perform a task more than once, which is common for module engineering, where you must perform higher grade mods multiple times to max them out.
    
    * **Bill of Materials:** Lists all materials required to perform all tasks listed as in progress. A gauge and number showing how many more are needed to fulfill all task requirements is shown. If relevant, an individual required cost may contain recommended trades which can be planned as tasks. When recommending trades, the application will consider all planned tasks and will not recommend a trade if it would conflict with another task.   
    
    * **Task Catalog:** A categorized list of all known tasks. 
  
  * **Missions:** Details of any ongoing missions are displayed here
  
  * **Community Goals:** Details of any community goals you have signed up for are displayed here
  
  
  #### Known Issues
- On-foot loadout tabs do not currently work. The back end structure is mostly in place, but I have not written the front end portion just yet. Some Odyssey specific data may also be missing or partially missing. I am adding data like engineer IDs, gear mod enum names, etc. as I am able to find examples from other player journal files, or unlock engineers and mods on my own.
  
- Some tasks don't automatically become marked complete in the UI, in particular material trades may not always work, and synthesis trades do not currently auto-decrement when completed. The material costs and rewards from tasks are still be accounted for in the inventory tabs.
    
- Trade recommendations in the bill of materials lists are not always ideal, you should make your own judgement when choosing to trade materials or not. The old JavaFX UI had a better algorithm that I have not ported, It too had some issues. I will need to think about how I want to attack this to hopefully avoid the mistakes of the past.
  
- The Web App code is currently only tested in Chromium based browsers (Chrome, Chromium, Edge). For the most part, the application doesn't have any browser specific features, but some of the CSS responsible for building the UI is Webkit or Chrome specific. I do hope to test and fully support FireFox at some point, but it isn't the highest priority. 
  
- \* **New in Odyssey** \* Occasionally, the journal file stops getting written to. When this happens, the app may not function correctly. If you observe this please vote here for this bug in the Frontier issue tracker: https://issues.frontierstore.net/issue-detail/35645
    
- \* **New in Odyssey** \* The planetary GPS currently reports distances incorrectly. This worked before Odyssey, so I probably have an assumption about the status.json file baked into my code that I need to fix, but have not had the time to do yet. Direction does not appear to be affected, and the map functions when in-ship, SRV, or on-foot.

#### Planned features
In addition to trying to fix issues when I have time, there are also a number of new features I want to add or bring forward from my original implementation before I switched to a web app front end. Here's a few: 

- The old UI had some integrated task buttons to help assist with planning of improvements to your current build. I plan to re-implement these buttons. There were also trade tasks available in the storage tabs, within the drop down lists of crafting materials. I also plan to pull these into the current UI.

- Trade task types to accommodate the new micro-materials need to be implemented. The new barter system is different enough compared to the ship material trade system, so I will not be able to re-use the same approach for it. This will require some changes to the task tab to accommodate the barter system.  

- Engineer unlocks and requirements for meeting associated engineers should be made into tasks that can be tracked just like anything else. I would like this feature mostly for completeness, but I do think it should be easy enough to do.