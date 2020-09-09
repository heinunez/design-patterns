# Abstract Factory (Kit)
## Intención
Dar una interfaz para crear familias de objetos relacionados o dependientes sin especificar sus clases concretas.
## Úsalo cuando
- Un sistema deba ser independiente de cómo se crean, componen y representan sus objetos
- Un sistema deba configurarse con una de las múltiples familias de objetos
- Quieras proporcionar una biblioteca de clase de objetos y solo quieres mostrar las interfaces, no las implementaciones.
## Ingredientes
- **AbstractFactory** (WidgetFactory)
    - Interface con operaciones que crean objetos abstractos
- **ConcreteFactory** (WindowsWidgetFactory, MacOSWidgetFactory)
    - Implementan las operaciones para crear objetos concretos
- **AbstractProduct** (Button, ScrollBar)
    - Interface que representa un tipo de objeto
- **ConcreteProduct** (MacOSButton, WindowsButton, MacOSScrollBar, WindowsScrollBar)
    - Objetos que corresponden a un ConcreteFactory específico.
- **Client**
    - Usa solo las interfaces AbstractFactory y AbstractProduct