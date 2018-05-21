# EDEPS
**Elite Dangerous Engineering Procurement System - Alpha (Working Title)**

The immediate goal of this project is to provide the user with a means to plan the procurement of items, engineering effects, and other tasks. The app also provides some supplemental about the players ship, including weapon and internal module loadout, and a listing of stats and modifications for each module. The player's inventory, consisting of all engineering materials and cargo, is listed in categorized tabs for reference.

##### Current Status

Currently still focusing on fleshing out the core functionality. For the time being, I am not focusing on colors, fonts, spacing or other style related tasks otehr than those to make the UI more or less acceptable.

The UI consists of several tabbed panels, with categories of functionality grouped together, below is a general outline of how each tab is currently functioning.

* **Ship Loadout Tab**
    * This tab has 4 sub tabs, ship statistics, core internals, optional internals, and hardpoints. The module sub-tabs are all working as intended, but the ship statistics tab is still pretty rough. I am still not completely sure of the entirety of all the stats I want to put on that panel and how exactly to organize them, but will probably apply a similar look and feel to the other panels.

* **Procurement Tasks tab**
    * This tab contains three "Sections" arranged vertically as described below. At this time, the functionality of this panel is complete, though some incidental features may be added, particularly to the procurement selection tree.
        1. **Procurement Selection Tree** (top section)
            * The left side contains a tree structure with all available tasks, organized by categories. Selecting a task type from the tree will display all of the grades (in the case of modifications) or related procurement tasks of the selected type in the list on the right-hand side. Tasks selectied from this list will appear in the task list.
        2. **Task List** (middle section)
            * Selected tasks appear in this list. Tasks are presented as collapsed drop-down panels, when clicked the panel is expanded. Within the expanded panel is a list of all the task's pertinent information, typically the procurement costs and any applicable effects of the task.
        3. **Cost List** (bottom section)
            * The cumulative costs of all the tasks in the task list are reflected in this list, with a "need" column displaying the total number of the item needed to fulfil some task in the task list. Similarly to the task list, costs are displayed in expandable drop downs which, when expanded provide more details about the item. Details include known locations where the item can be found, and if applicable, further drop downs will include any trades that can be made to procure the needed item.

 * **Inventory Tab**
    * This tab contains 4 sub-tabs, displaying the player's inventory of raw, manufactured, and data crafting materials, as well as a tab for the ship's cargo, if any is present.
