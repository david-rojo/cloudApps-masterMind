# Welcome to MasterMind

[David Rojo(@david-rojo)](https://github.com/david-rojo)

<table class="tg">
<thead>
  <tr>
    <th class="tg-uzvj">Topic</th>
    <th class="tg-7btt">Solution (include link)</th>
    <th class="tg-amwm">Type</th>
    <th class="tg-7btt">Improvements</th>
  </tr>
</thead>
<tbody>
  <tr>
    <td class="tg-9wq8">Design</td>
    <td class="tg-c3ow"><a href="https://github.com/david-rojo/cloudApps-masterMind/tree/domainModel">domainModel</a></td>
    <td class="tg-baqh">branch</td>
    <td class="tg-0pky"><span style="font-weight:400;font-style:normal">Clases del Modelo del Dominio </span><span style="font-weight:600">pero acopladas a tecnologías de interfaz ahora y todas con la Ley del Cambio Continuo y de granos grueso con el advenimiento de nueva funcionalidad</span></td>
  </tr>
  <tr>
    <td class="tg-9wq8">Modular Design</td>
    <td class="tg-c3ow"><a href="https://github.com/david-rojo/cloudApps-masterMind/tree/documentView">documentView</a></td>
    <td class="tg-baqh">branch</td>
    <td class="tg-0pky"><span style="font-weight:400;font-style:normal">Clases Vistas de Texto separadas de los Modelos del Dominio </span><span style="font-weight:600">pero con Modelos de grano grueso con el advenimiento de nueva funcionalidad</span></td>
  </tr>
  <tr>
    <td class="tg-9wq8" rowspan="6">Object Oriented Design</td>
    <td class="tg-c3ow"><a href="https://github.com/david-rojo/cloudApps-masterMind/commit/8e7d4db490cd3659d6a3a05ea7b53e32b4ad0dc9">dv.withoutFactoryMethod</a> (code)</td>
    <td class="tg-baqh">commit in modelViewPresenter branch</td>
    <td class="tg-0pky"><span style="font-weight:400;font-style:normal">Clase Vistas de Interfaz Gráfica de Usuario </span><span style="font-weight:600">pero con DRY en Vistas de tecnologías diferentes y con Modelos de grano grueso con el advenimiento de nueva funcionalidad</span></td>
  </tr>
  <tr>
    <td class="tg-baqh"><a href="https://github.com/david-rojo/cloudApps-masterMind/commit/aaf3f720ba42059730333b9c66fc053c0e92231f">dv.withFactoryMethod</a> (code)</td>
    <td class="tg-baqh">commit in modelViewPresenter branch</td>
    <td class="tg-0lax"><span style="font-weight:400;font-style:normal">Clase Vista abstracta para Open/Close de sus tecnologías </span><span style="font-weight:600">pero con Modelos de grano grueso con el advenimiento de nueva funcionalidad</span></td>
  </tr>
  <tr>
    <td class="tg-baqh"><a href="https://github.com/david-rojo/cloudApps-masterMind/commit/b6b72ee7ad0fc1f248e46e440136b377c9aa825c">modelViewPresenter.presentationModel</a> (code)</td>
    <td class="tg-baqh">commit in modelViewPresenter branch</td>
    <td class="tg-0lax"><span style="font-weight:400;font-style:normal">Clases Controladoras entre Vistas y Modelos por cada Caso de Uso </span><span style="font-weight:600">pero con la clase Principal y las Vistas acopladas a cada controlador actual y futuro</span></td>
  </tr>
  <tr>
    <td class="tg-baqh"><a href="https://github.com/david-rojo/cloudApps-masterMind/commit/882296dfbb8d56c7743d73863d078dbd5d56b7f0">mvp.pm.withFacade</a> (code)</td>
    <td class="tg-baqh">commit in modelViewPresenter branch</td>
    <td class="tg-0lax"><span style="font-weight:400;font-style:normal">Clase Lógica que encapsula Controladores y Modelos </span><span style="font-weight:600">pero con Vistas con DRY en la Lógica de Control</span></td>
  </tr>
  <tr>
    <td class="tg-c3ow"><a href="https://github.com/david-rojo/cloudApps-masterMind/commit/122df0677abe4e44678153cd7ebfb1c7b2a2c6e6">mvp.pm.withoutDoubleDispatching</a> (code)</td>
    <td class="tg-baqh">commit in modelViewPresenter branch</td>
    <td class="tg-0pky"><span style="font-weight:400;font-style:normal">Clase Estado para la Inversión de Control de Vistas a la Lógica </span><span style="font-weight:600">pero violando el Principio de Sustitución de Liskov</span></td>
  </tr>
  <tr>
    <td class="tg-c3ow"><a href="https://github.com/david-rojo/cloudApps-masterMind/commit/0e65800d212598e681d90af69cd4a459ec95f5d7">mvp.pm.withDoubleDispatching</a> (code)<br>(documentation and diagrams: <a href="https://github.com/david-rojo/cloudApps-masterMind/blob/modelViewPresenter/docs/README.md">here</a>)</td>
    <td class="tg-baqh">commit in modelViewPresenter branch</td>
    <td class="tg-0pky"><span style="font-weight:400;font-style:normal">Clase Visitador de Controladores para Técnica de Doble Despacho</span></td>
  </tr>
  <tr>
    <td class="tg-9wq8" rowspan="2">Design Patterns</td>
    <td class="tg-c3ow"><a href="https://github.com/david-rojo/cloudApps-masterMind/tree/mvp.pm.withComposite">mvp.pm.withComposite</a></td>
    <td class="tg-baqh">branch</td>
    <td class="tg-0pky"><span style="font-weight:400;font-style:normal">Clase Comando del menú y Controlador Compuesto de ciertos Estados para Open/Close con nuevos Casos de Uso aplicando </span><span style="font-weight:600">UndoRedo</span></td>
  </tr>
  <tr>
    <td class="tg-baqh"><a href="https://github.com/david-rojo/cloudApps-masterMind/tree/master">nextStep</a> (code)</td>
    <td class="tg-baqh">branch</td>
    <td class="tg-0lax">Weekend work</td>
  </tr>
</tbody>
</table>
