# Getting Started with GitHub and Android Studio

Follow these steps to clone your project and open it in Android Studio.

---

## Step 1: Log In to GitHub

1. Open a browser and go to [github.com](https://github.com)
2. Click **Sign in** in the top right corner
3. Enter your username and password, then click **Sign in**

---

## Step 2: Find Your Project Repository

Go to one of the following links depending on your project:

- **Choice Game:** https://github.com/icanhazcodeplz/choiceGame
- **Pokemon Battle:** https://github.com/icanhazcodeplz/pokemonBattle

---

## Step 3: Copy the Clone URL

1. On the repository page, click the green **Code** button
2. Make sure **HTTPS** is selected (not SSH or GitHub CLI)
3. Click the copy icon to copy the URL — it will look like:
   `https://github.com/icanhazcodeplz/choiceGame.git`

---

## Step 4: Clone the Repository Using Git Bash

1. Open the Start menu, search for **Git Bash**, and open it
2. Create a new folder called **code** by typing:
   ```
   mkdir code
   ```
3. Move into that folder:
   ```
   cd code
   ```
4. Type the clone command using the URL you copied:
   ```
   git clone https://github.com/icanhazcodeplz/choiceGame.git
   ```
   Or for Pokemon Battle:
   ```
   git clone https://github.com/icanhazcodeplz/pokemonBattle.git
   ```
5. Press **Enter** — Git will download the project into `C:\Users\ComputerXXX\code\choiceGame` (or `C:\Users\ComputerXXX\code\pokemonBattle`)

---

## Step 5: Open the Project in Android Studio

1. Open **Android Studio**
2. On the Welcome screen, click **Open**
   - If you already have a project open, go to **File > Open**
3. Navigate to the folder where you cloned the project (e.g., `C:\Users\ComputerXXX\code\choiceGame`)
4. Select the project folder and click **OK**
5. Wait for Android Studio to finish loading and syncing the project — this may take a minute
6. You're ready to go!

---

## Troubleshooting

- **Git Bash not installed?** Download Git for Windows at https://git-scm.com/download/win
- **Android Studio asks to open as a project vs. a file?** Always choose **Open as Project**
- **Gradle sync errors?** Try **File > Sync Project with Gradle Files**
