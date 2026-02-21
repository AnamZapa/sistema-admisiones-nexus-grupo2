README – Nexus

Descripción del Proyecto

Este proyecto consiste en el desarrollo de una plataforma web universitaria que permite:

Visualizar carreras disponibles
Consultar información detallada de cada programa académico
Realizar proceso de inscripción
Gestionar solicitudes desde perfil administrativo
Permitir al estudiante completar su proceso académico
El sistema busca digitalizar y optimizar el flujo completo desde la exploración de la carrera hasta la admisión y matrícula.

Perfiles del Sistema

1. Perfil Administrativo
  Funcionalidades:
    Visualizar listado de solicitudes.
    Aprobar solicitudes.
    Rechazar solicitudes.
    Solicitar documentación adicional.
    Consultar estado del aspirante.

2. Perfil Estudiante
  Funcionalidades:
    Iniciar sesión tras ser admitido.
    Completar proceso de pago.
    Seleccionar materias.
    Elegir horario (en desarrollo).
    Consultar estado de matrícula.

Flujo General del Sistema:

Usuario visita la página.
Visualiza listado de carreras.
Selecciona carrera → consulta descripción y pensum.
Hace clic en Inscribirme.
Completa formulario.
Administrador gestiona solicitud.
  Si es aprobado:
    El estudiante inicia sesión. 
    Selecciona materias.

Objetivo General

Diseñar e implementar una plataforma web que permita gestionar de manera eficiente el proceso de inscripción, admisión y matrícula de estudiantes, facilitando la interacción entre aspirantes, estudiantes y personal administrativo.

Objetivos Específicos

Mostrar un listado dinámico de carreras disponibles.
Permitir consultar descripción y pensum de cada programa.
Implementar formulario de inscripción básico.
Gestionar solicitudes desde perfil administrativo.
Permitir que el estudiante admitido:
  Inicie sesión.
  Seleccione materias y horarios (módulo en desarrollo).

Alcance del Proyecto

Definir las funcionalidades que serán desarrolladas dentro del proyecto y cuáles quedan fuera del alcance actual, con el fin de:

  Evitar ambigüedades.
  Controlar el crecimiento no planificado del sistema.
  Establecer expectativas claras.
  Facilitar futuras fases de evolución.

Dentro del alcance:
    Página principal Pública (Exploración de Carreras)
    Listado dinámico de carreras disponibles.
    Vista detallada por carrera que incluya:
      Descripción del programa.
      Pensum académico.
      Botón de inscripción por carrera.
      Formulario básico de inscripción con:
      Datos personales.
      Selección de carrera.
      Validaciones básicas de campos.
      Registro de solicitud en base de datos.
      Mensaje de confirmación de envío.

Módulo Administrativo:

Inicio de sesión para perfil administrativo.
  Visualización de listado de solicitudes.
  Filtros por:
  Estado (Pendiente, Aprobado, Rechazado).
  Carrera.
  Visualización de detalle de cada aspirante.
Acciones sobre solicitudes:
  Aprobar, Rechazar.
  Solicitar documentación adicional.
Cambio automático de estado según acción realizada.
Dashboard básico con:
  Total de solicitudes.
  Cantidad por estado.
  Solicitudes por carrera.

Modulo Estudiante:
  Inicio de sesión para estudiantes admitidos.
  Visualización de estado de admisión.
  Vista preliminar para selección de materias (estructura base).
  Persistencia de datos en base de datos.

Seguridad y Gestión de Sesiones
  Autenticación básica por roles (Administrador / Estudiante).
  Control de acceso por perfil.
  Protección de rutas internas.
  Manejo de sesiones activas.

Base de Datos:

Diseño de modelo relacional que incluya:
  Usuarios.
  Roles.
  Carreras.
  Solicitudes.
  Estados.
  Relaciones entre entidades.
  Integridad referencial.


Fuera de alcance:

  Integraciones Externas
  Integración con sistemas financieros institucionales.
  Integración con sistemas académicos externos.
  Funcionalidades Académicas Avanzadas
  Generación automática de horarios optimizados.
  Asignación automática de materias según prerrequisitos.
  Gestión completa de docentes.
  Sistema de notas y evaluaciones.
  Expedición de certificados académicos.

Reportes financieros detallados:

  Gestión presupuestal.
  Gestión de nómina.
  CRM institucional completo.

Características Técnicas Avanzadas:

  Arquitectura de microservicios.
  Aplicación móvil.
  Inteligencia artificial para predicción de admisión.
  Alta disponibilidad en la nube.
  Autenticación multifactor.
  Cifrado avanzado de datos sensibles.

Tecnologías

Frontend: HTML, CSS, Bootstrap, JavaScript
Backend: JavaScript
Servidor: Spring Boot
Base de datos: SQL Server, Phyton
Control de versiones: Git

Integrantes:

Ana Marcela Gallego | rol | 
David Quiroz | rol | 
Miguel Angel Muñoz | rol | @MiguelM1004
Ana María Zapata | rol | @AnamZapa
