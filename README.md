# Guide pour compiler et générer l'APK Android (Java)

Ce projet est un projet Android natif prêt à être compilé soit directement sur **GitHub (sans rien installer)**, soit avec **Android Studio**, soit en **ligne de commande**.

---

## ⚡ Méthode 1 : Automatique avec GitHub Actions (Recommandé & 100% Cloud)

Ce projet inclut le workflow prêt à l'emploi `.github/workflows/build-apk.yml` qui compile l'APK automatiquement sur les serveurs de GitHub !

### Étapes :
1. Créez un nouveau dépôt sur [GitHub](https://github.com/new).
2. Téléversez / Pushez les fichiers de ce projet sur votre dépôt :
   ```bash
   git init
   git add .
   git commit -m "Initial commit - Android Hello Java"
   git branch -M main
   git remote add origin https://github.com/VOTRE_PSEUDO/VOTRE_DEPOT.git
   git push -u origin main
   ```
3. Sur votre dépôt GitHub, cliquez sur l'onglet **"Actions"**.
4. Vous verrez le workflow **"Build Android APK"** se lancer automatiquement.
5. Une fois terminé (icône verte ✔️), cliquez sur le build.
6. Dans la section **"Artifacts"** en bas de page, cliquez sur **app-debug-apk** pour télécharger directement le fichier APK généré !

---

## Méthode 2 : Avec Android Studio (Local)
1. Téléchargez et décompressez le fichier **ZIP** de ce projet.
2. Ouvrez **Android Studio**.
3. Cliquez sur **File > Open** et sélectionnez le dossier décompressé.
4. Laissez Gradle synchroniser le projet (*Sync Project with Gradle Files*).
5. Pour générer l'APK :
   - Allez dans le menu : **Build > Build Bundle(s) / APK(s) > Build APK(s)**.
   - Une fois la compilation terminée, cliquez sur le lien **locate** dans la notification en bas à droite.
   - Votre fichier APK se trouvera dans : `app/build/outputs/apk/debug/app-debug.apk`.

---

## Méthode 3 : En ligne de commande Gradle (Terminal)
Dans le dossier du projet, exécutez simplement :

```bash
# Sur Linux / macOS :
./gradlew assembleDebug

# Sur Windows :
gradlew.bat assembleDebug
```

L'APK généré sera disponible dans :
`app/build/outputs/apk/debug/app-debug.apk`

---

## Installer l'APK sur votre téléphone Android
1. Activez le **Débogage USB** sur votre téléphone (dans Options pour développeurs).
2. Branchez votre téléphone à l'ordinateur via USB.
3. Exécutez :
```bash
adb install app/build/outputs/apk/debug/app-debug.apk
```
Ou transférez simplement le fichier `app-debug.apk` sur votre smartphone par câble, WhatsApp ou Google Drive, puis ouvrez-le pour l'installer !
