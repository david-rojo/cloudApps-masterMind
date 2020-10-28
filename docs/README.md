# MasterMind - mvp.pm.withProxy

**PENDING TO BE UPDATED!**

### 1. Requirements

- [Rules](https://en.wikipedia.org/wiki/Mastermind_(board_game))
- [Video](https://www.youtube.com/watch?v=dMHxyulGrEk)
- You play against the computer
- Secret combination doesn't have repeated colors and any position is empty
- Functionality: Basic + undo/redo
- Interface: Text
- Distribution: Standalone
- Persistence: No
- Graphical interface is out of the scope of the project, so it is not described and the available code is not tested that is working

![MASTERMIND GAME](img/mastermind.jpg)

In this branch has been taken in account the application of three design patterns:

- **Command**: for the Menu
- **Composite**: for multi-controllers
- **Memento**: for undo/redo functionality

### 2. Architecture

![ARCHITECTURE](img/architecture.png)

[diagram source code](img/plantuml/architecture.plantuml)

### 3. Packages

#### 3.1. cloudapps.mastermind package

![PACKAGE-MASTERMIND](img/package-cloudapps-mastermind.png)

[diagram source code](img/plantuml/package-cloudapps-mastermind.plantuml)

#### 3.2. cloudapps.mastermind.views package 

![PACKAGE-MASTERMIND-VIEWS](img/package-cloudapps-mastermind-views.png)

[diagram source code](img/plantuml/package-cloudapps-mastermind-views.plantuml)

#### 3.2. cloudapps.mastermind.views.console package

![PACKAGE-MASTERMIND-VIEWS-CONSOLE](img/package-cloudapps-mastermind-views-console.png)

[diagram source code](img/plantuml/package-cloudapps-mastermind-views-console.plantuml)

#### 3.3. cloudapps.mastermind.models package

![PACKAGE-MASTERMIND-MODELS](img/package-cloudapps-mastermind-models.png)

[diagram source code](img/plantuml/package-cloudapps-mastermind-models.plantuml)

#### 3.4. cloudapps.mastermind.controllers package

![PACKAGE-MASTERMIND-CONTROLLER](img/package-cloudapps-mastermind-controllers.png)

[diagram source code](img/plantuml/package-cloudapps-mastermind-controllers.plantuml)

#### 3.5. cloudapps.mastermind.types package

![PACKAGE-MASTERMIND-TYPES](img/package-cloudapps-mastermind-types.png)

[diagram source code](img/plantuml/package-cloudapps-mastermind-types.plantuml)

#### 3.6. cloudapps.utils package

![PACKAGE-UTILS](img/package-cloudapps-utils.png)

[diagram source code](img/plantuml/package-cloudapps-utils.plantuml)

### 4. Deployment

![DEPLOYMENT](img/deployment.png)

[diagram source code](img/plantuml/deployment.plantuml)

### Author

[David Rojo(@david-rojo)](https://github.com/david-rojo)

