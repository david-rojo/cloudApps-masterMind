# MasterMind - mvp.pv 

### 1. Requirements

- [Rules](https://en.wikipedia.org/wiki/Mastermind_(board_game))
- [Video](https://www.youtube.com/watch?v=dMHxyulGrEk)
- You play against the computer
- Secret combination doesn't have repeated colors and any position is empty
- Functionality: Basic
- Interface: Text
- Distribution: Standalone
- Persistence: No

![MASTERMIND GAME](img/mastermind.jpg)

### 2. Design

In this branch has been taken in account the change of the control, in the original code ([modelViewPresenter](https://github.com/david-rojo/cloudApps-masterMind/tree/modelViewPresenter) branch applying **mvp.pm.withDoubleDispatching** approach) the Views controlled the Controllers, but here the Controllers have the responsability of the game, now Views are "dummies", only execute methods managed by Controllers to read and write information to the player.

### 3. Architecture

![ARCHITECTURE](img/architecture.png)

[diagram source code](img/plantuml/architecture.plantuml)

### 4. Packages

#### 4.1. cloudapps.mastermind package

![PACKAGE-MASTERMIND](img/package-cloudapps-mastermind.png)

[diagram source code](img/plantuml/package-cloudapps-mastermind.plantuml)

#### 4.2. cloudapps.mastermind.controllers package

![PACKAGE-MASTERMIND-CONTROLLER](img/package-cloudapps-mastermind-controllers.png)

[diagram source code](img/plantuml/package-cloudapps-mastermind-controllers.plantuml)

#### 4.3. cloudapps.mastermind.views package

![PACKAGE-MASTERMIND-VIEWS](img/package-cloudapps-mastermind-views.png)

[diagram source code](img/plantuml/package-cloudapps-mastermind-views.plantuml)

#### 4.4. cloudapps.mastermind.models package

![PACKAGE-MASTERMIND-MODELS](img/package-cloudapps-mastermind-models.png)

[diagram source code](img/plantuml/package-cloudapps-mastermind-models.plantuml)

#### 4.5. cloudapps.mastermind.types package

![PACKAGE-MASTERMIND-TYPES](img/package-cloudapps-mastermind-types.png)

[diagram source code](img/plantuml/package-cloudapps-mastermind-types.plantuml)

#### 4.6. cloudapps.utils package

![PACKAGE-UTILS](img/package-cloudapps-utils.png)

[diagram source code](img/plantuml/package-cloudapps-utils.plantuml)

### 5. Deployment

![DEPLOYMENT](img/deployment.png)

[diagram source code](img/plantuml/deployment.plantuml)

### Author

[David Rojo(@david-rojo)](https://github.com/david-rojo)

