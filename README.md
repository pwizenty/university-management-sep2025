# university-management-sep2025

# 📦 Spring Boot Maven Project – IntelliJ Setup Guide

Welcome! This guide will help you import and run a Maven-based Spring Boot project in **IntelliJ IDEA**.

---

## 🧰 Requirements

- [Java JDK 24+](https://adoptopenjdk.net/)
- [IntelliJ IDEA](https://www.jetbrains.com/idea/download/) (Community or Ultimate)
- [Maven](https://maven.apache.org/) (Optional – IntelliJ includes its own Maven)
- [Docker](https://www.docker.com/) (Optional – Docker for Database Deployment)

---

## 🚀 Importing the Project

1. **Open IntelliJ IDEA**

2. **Click** `File` > `Open...`

3. **Select the project folder**
   (the one containing `pom.xml`)

4. IntelliJ will detect it's a Maven project and **prompt to import dependencies**.

5. If prompted:
   ✅ Choose to **Enable Auto Import**
   ✅ Set the correct **Java SDK**

---

## 🛠️ Running the App

After the project loads:
0. Run the following command to start the MariaDB in a Docker contaier `docker run --name mysql-student -p 3306:3306 --env MARIADB_ROOT_PASSWORD=sep-mysql-password --env MARIADB_DATABASE=student  mariadb:latest`

1. Navigate to your `Application.kt` or `Application.java` file (it has the `main` method).

2. Right-click the file and choose `Run 'Application'`.

3. The Spring Boot app should start, and you'll see logs in the console.

4. Visit [http://localhost:8080](http://localhost:8080) to access your app.

---

## ⚙️ Common IntelliJ Tips

- Open the **Maven** tab (on the right) to run lifecycle commands like `clean`, `install`, `package`.

- Use the **Spring Boot Dashboard** (in IntelliJ Ultimate) for easier management.

---

## 💡 Troubleshooting

- If dependencies don't download:
  `File` > `Invalidate Caches / Restart`

- Check Java SDK via:
  `File` > `Project Structure` > `Project SDK`

- Still stuck? Try deleting `.idea/` and `*.iml` files and re-import the project.

---
