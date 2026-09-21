NAO — App de Pesca Deportiva

Proyecto de aula (Spring Boot) para una aplicación móvil/web orientada a pescadores deportivos del Caribe colombiano (Cartagena), que ayuda a decidir si vale la pena salir a pescar, dónde, y con qué equipo — combinando datos de clima/marea/luna con el histórico de capturas que los propios usuarios registran.

Contexto del proyecto

Diferenciador central frente a apps genéricas de pesca (Fishbrain, WeFish, etc.):

Semáforo de condiciones por muelle basado en marea, viento, oleaje y fase lunar, con un sistema de pesos y umbrales de "veto" (ej. viento muy fuerte fuerza el semáforo hacia abajo, sin importar que otras condiciones sean buenas).
Filtro por especie, con recomendación de equipo y enlaces a tiendas.
Indicador de popularidad de zona basado en usuarios únicos, no en volumen total de registros — evita que un solo usuario infle el dato.
Registro de capturas rápido y verificable (GPS y timestamp automáticos, no editables), con medallas por especie (una por especie, no repetibles).
Feeds contextuales (por muelle, especie o zona), sin sistema de amigos/seguidores.
Modelo de privacidad tipo eBird: todo cuenta por defecto, el usuario puede ocultar una captura puntual del feed público o su ubicación exacta, sin perder su efecto en medallas ni en el indicador de zona.
Guías y tutoriales como HTML propio referenciado (no contenido rico en base de datos).

Cómo levantar el proyecto
bash
# Clonar el repositorio
git clone <url-del-repo>
cd fishing-app

# Levantar el proyecto (Windows)
.\mvnw.cmd spring-boot:run

# Levantar el proyecto (Mac/Linux)
./mvnw spring-boot:run

El proyecto queda disponible en http://localhost:8080.