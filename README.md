<a href="https://www.sqlite.org/index.html">
    <img align="right" src ="https://img.shields.io/badge/SQLite-07405e.svg?logo=sqlite&logoColor=white" alt="SQLite">
</a>

<a href="https://www.oracle.com/es/database/technologies/appdev/sql.html">
    <img align="right" src="https://custom-icon-badges.herokuapp.com/badge/SQL-025E8C.svg?logo=database&logoColor=white" alt="SQL">
</a>

<a href="https://www.java.com/">
    <img align="right" src="https://custom-icon-badges.herokuapp.com/badge/Java-E8E8E8.svg?logo=Java" alt="Java">
</a>

<h1 align="center">🗄 Manipulating Data Reading Database 📚</h1>


<p align="center">
    <img src="./assets/Execution of Histogram.gif" alt="Execution of Histogram">
    <sub>· Execution of a query to the database ·</sub>
</p>


## 📚 Fundamentals

The software available in this repository allows the graphical display of a histogram showing the frequency of use of the principal e-mail domains most used in the world, reading the set of e-mail addresses from a text file in the first version and then in the second version reading the set of e-mail addresses from the same file and storing it in a local database specified by an URL.


## 👨🏻‍💻 Implementation

The development of this practice consists of the creation of a histogram where the percentage of existing users for a given e-mail provider is represented using a bar chart diagram. The software consists of two versions where the Java libraries *JFreeChart* and *JCommon* are used for the graphical representation of the histogram in the first version and the Java *SQL* library is used for the second version.

### 1️⃣ <ins>First version:</ins>

The first version of this software introduces the creation of the main window of the application, and its design elements, such as the title, name of the axes, and dimensions, as well as the creation of the corresponding bar chart which will be arranged in that frame.

Similarly, we proceed to the creation of the dataset that will be used as a basis to create the histogram and which represents the e-mail domains. Likewise is checked that the e-mail addresses are correct in order to obtain the domain and calculate the frequency. The development of the project is based on the MVC (Model-View-Controller) pattern.

<img src="./diagrams/Kata 6. Version 1.png" alt="Kata 6. Version 1 Class Diagram" width="700px" height="500px">

### 2️⃣ <ins>Second Version:</ins>

The second version of this software introduces the connection with a local database through the file named *Kata6.db*, that represents the local database. After the connection to this mentioned database, a simple table is created with an id and the e-mail addresses reads from the file and the information of the existing e-mail provider domains is inserted into that table. After that, the first version of this software is used for the graphical representation of the histogram but instead of reading the e-mail addresses from a text file it is read from a local database.

<img src="./diagrams/Kata 6. Version 2.png" alt="Kata 6. Version 2 Class Diagram" width="700px" height="500px">


## 💾 Expected Outputs

The results of running each of the implemented versions can be found [here.](./docs/)


## 🚀 Build the project

1. Clone the repository using git with `git clone https://github.com/BrianSuarezSantiago/Manipulating-Data-Reading-Database-P2.git` command or download from [Source Code.](https://github.com/BrianSuarezSantiago/Manipulating-Data-Reading-Database-P2/archive/refs/heads/master.zip)

2. Move to the directory where you have the code.

3. Compile using `javac -d . *.java` command followed by the `java histogram.Main` command to run and use the available software.

<hr>
<p align="center">
Made with ♥️ in Spain
</p>
