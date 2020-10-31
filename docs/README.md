# MasterMind - mvp.pm.withProxy

### 1. Requirements

- [Rules](https://en.wikipedia.org/wiki/Mastermind_(board_game))
- [Video](https://www.youtube.com/watch?v=dMHxyulGrEk)
- You play against the computer
- Secret combination doesn't have repeated colors and any position is empty
- Functionality: Basic + undo/redo
- Interface: Text
- Distribution: Standalone + Client/Sever
- Persistence: No

![MASTERMIND GAME](img/mastermind.jpg)

In this branch has been taken in account the application of **Model/View/Presenter** with **Presenter of the Model** with **Reduced View** (Vista Achicada in Spanish)

- **Proxy** design pattern applied for the distributed execution

### 2. Architecture

![ARCHITECTURE](img/architecture.png)

[diagram source code](img/plantuml/architecture.plantuml)

### 3. Software quality

#### Design

- **Low Cohesion:** of Logic and Controllers that control and communicate.
- **High Coupling:** of Logic and Controllers to communication tecnologies.
- **Open/Close:** of Logic and Controllers when is needed to change the code of them with new communication tecnologies.

#### Redesign

- **Big Classes:** of Controllers with different branches for different communication tecnologies.

### 4. Packages

#### 4.1. cloudapps.mastermind package

![PACKAGE-MASTERMIND](img/package-cloudapps-mastermind.png)

[diagram source code](img/plantuml/package-cloudapps-mastermind.plantuml)

#### 4.2. cloudapps.mastermind.views package 

![PACKAGE-MASTERMIND-VIEWS](img/package-cloudapps-mastermind-views.png)

[diagram source code](img/plantuml/package-cloudapps-mastermind-views.plantuml)

#### 4.3. cloudapps.mastermind.models package

![PACKAGE-MASTERMIND-MODELS](img/package-cloudapps-mastermind-models.png)

[diagram source code](img/plantuml/package-cloudapps-mastermind-models.plantuml)

#### 4.4. cloudapps.mastermind.controllers package

![PACKAGE-MASTERMIND-CONTROLLER](img/package-cloudapps-mastermind-controllers.png)

[diagram source code](img/plantuml/package-cloudapps-mastermind-controllers.plantuml)

#### 4.5. cloudapps.mastermind.controllers.implementation package

![PACKAGE-MASTERMIND-CONTROLLER-IMPLEMENTATION](img/package-cloudapps-mastermind-controllers-implementation.png)

[diagram source code](img/plantuml/package-cloudapps-mastermind-controllers-implementation.plantuml)

#### 4.6. cloudapps.mastermind.distributed package

![PACKAGE-MASTERMIND-DISTRIBUTED](img/package-cloudapps-mastermind-distributed.svg)

[diagram source code](img/plantuml/package-cloudapps-mastermind-distributed.plantuml)

#### 4.7. cloudapps.mastermind.distributed.dispatchers package

![PACKAGE-MASTERMIND-DISTRIBUTED-DISPATCHERS](img/package-cloudapps-mastermind-distributed-dispatchers.png)

[diagram source code](img/plantuml/package-cloudapps-mastermind-distributed-dispatchers.plantuml)

#### 4.8. cloudapps.mastermind.distributed.dispatchers.errors package

![PACKAGE-MASTERMIND-DISTRIBUTED-DISPATCHERS-ERRORS](img/package-cloudapps-mastermind-distributed-dispatchers-errors.png)

[diagram source code](img/plantuml/package-cloudapps-mastermind-distributed-dispatchers-errors.plantuml)

#### 4.9. cloudapps.mastermind.distributed.dispatchers.undoredo package

![PACKAGE-MASTERMIND-DISTRIBUTED-DISPATCHERS-UNDOREDO](img/package-cloudapps-mastermind-distributed-dispatchers-undoredo.png)

[diagram source code](img/plantuml/package-cloudapps-mastermind-distributed-dispatchers-undoredo.plantuml)

#### 4.10. cloudapps.mastermind.types package

![PACKAGE-MASTERMIND-TYPES](img/package-cloudapps-mastermind-types.png)

[diagram source code](img/plantuml/package-cloudapps-mastermind-types.plantuml)

#### 4.11. cloudapps.utils package

![PACKAGE-UTILS](img/package-cloudapps-utils.png)

[diagram source code](img/plantuml/package-cloudapps-utils.plantuml)

### 5. Deployment

![DEPLOYMENT](img/deployment.png)

[diagram source code](img/plantuml/deployment.plantuml)

### Author

[David Rojo(@david-rojo)](https://github.com/david-rojo)

