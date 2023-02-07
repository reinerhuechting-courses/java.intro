# Java-Entwicklungsumgebung für Kurse

Dieses Repo enthält Informationen und Beispielcode für den Start eines
Java-Programmierkurses.

## Verwendete Tools

### Programmiersprache

Als Programmiersprache wird Java verwendet.
Um Java-Programme zu entwickeln, muss ein *Java Development Kit*
installiert werden.
Für diesen Kurs wird Java in der Version 17 empfohlen, das z.B. unter der folgenden
Adresse heruntergeladen werden kann:

* [*OpenJdk* zum Download](https://adoptium.net/de/)

### Empfohlene Entwicklungsumgebung

Generell wird außer dem Compiler lediglich ein beliebiger Texteditor benötigt,
um mit Java-Code zu arbeiten.
Bequemer wird es aber, wenn der Editor die Sprache kennt und die Navigation im
Quellcode unterstützt.
Noch besser wird es, wenn der Editor auch Funktionen zum Übersetzen,
Ausführen von Tests etc. bereitstellt.

* **[IntelliJ](https://www.jetbrains.com/idea/)**: Sehr gute und weit verbreitete *Entwicklungsumgebung* (IDE) für Java.
  IntelliJ enthält neben einem Editor auch das Build-Management-System *Maven*
  und diverse Plugins für die Anzeige und Formatierung von Quellcode.

* **[Visual Studio Code](https://code.visualstudio.com/)**: Sehr guter universeller Editor, der mittels Plugins
  auch auf verschiedenste Programmiersprachen "getuned" werden kann.
  VSCode ist keine *Entwicklungsumgebung* im eigentlichen Sinn, kann aber für viele
  Sprachen mittels Plugins soweit erweitert werden, dass es fast die gleichen
  Funktionen wie eine vollwertige IDE bietet.
  Build-Management-Systeme wie *Maven* müssen aber separat installiert werden.

### Build-Management

* **[Maven](https://maven.apache.org/)**: Ein Standard-Build-System für Java.
  Beim Compilieren von komplexeren Projekten sind normalerweise diverse Dinge
  zu beachten. Z.B. kann es sein, dass das Projekt von externen Bibliotheken abhängt
  oder mit bestimmten Compilereinstellungen übersetzt werden soll.
  Theoretisch können diese Dinge beim Aufruf des Compilers manuell festgelegt werden.
  Einfacher ist es allerdings meistens, diese Einstellungen einem
  *Build-Management-System* zu überlassen.
  Diese werden i.d.R. über Dateien konfiguriert, die mit im Projekt liegen, und machen
  dann alle Einstellungen selbst.

  * Bei IntelliJ wird Maven mitgeliefert, muss also nicht separat installiert werden.
    Wenn man VSCode benutzt, muss man es selbst zusätzlich installieren.
  * Zusatzinfo: Generell basieren "Projekte" von IDEs wie z.B. auch *MS Visual Studio*,
    *Eclipse* o.Ä. auf solchen Build-Management-Tools.
    Andere verbreitete Systeme sind *Make* oder *CMake*.
    Die Programmiersprache *Go* hat ein solches Buildsystem eingebaut,
    das mittels der `go.mod`-Dateien gesteuert wird, die zu jedem Modul gehören.

### Versionskontrolle

* **[Git](https://git-scm.com/)**: Ein Versionskontrollsystem, das es ermöglicht,
  Quellcode zu verwalten. Damit ist gemeint, dass man nach jeder (relevanten)
  Änderung sogenannte *Commits* machen kann, die dann in einer *Projekt-Historie*
  nachvollziehbar sind und über das Internet (z.B. mittels *[GitHub](https://github.com/)*)
  auch zwischen verschiedenen Entwicklern synchronisiert werden können.

  Git wird für die hier verwendeten Programmierprojekte verwendet, um Material bereitzustellen.
