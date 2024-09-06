# Projekt-Dokumentation

Gruppenname: Hunt: Showdown 1896

| Datum | Version | Zusammenfassung                                              |
| ----- | ------- | ------------------------------------------------------------ |
|  23.08.2024     | 0.0.1   | Heute haben wir das Projekt aufgesetzt und auf GitHub geladen. Projektdokumentation aufgesetzt. |
|   30.08.2024    | 0.0.2     | Heute haben wir das Steel, Coke Item in das Spiel eingefügt und die Tools, Armor designt                                                              |
|       | 1.0.0   |                                                              |

## 1 Informieren

YouTubecode Setup tutorial
 
https://www.youtube.com/watch?v=0Pr_iHlVKsI
Time 10:20

### 1.1 Ihr Projekt

Wir erstellen einen Minecraft Mod für den Modloader «Fabric».
Wir implementieren ein neues Item: «Koks». Dieses kann man herstellen, in dem man Kohle im Ofen verarbeitet.
Wir implementieren ein neues Item: «Stahl».
Eisenerz kann in einem neuen, von uns implementierten Block, dem Stahlofen, mit Koks angereichert werden 🡪 Man erhält Stahl.
Aus dem Stahl können neue Rüstungsteile und Werkzeuge hergestellt werden, welche eine höhere Belastbarkeit als Eisen aufweisen. Ebenfalls implementieren wir einen Stahlblock.

### 1.2 User Stories

| US-№ | Verbindlichkeit | Typ  | Beschreibung                       |
| ---- | --------------- | ---- | ---------------------------------- |
| 1  |    Muss             |  Funktional    | Als Spieler möchte ich Kohle im Ofen verarbeiten können, um daraus Koks zu erhalten. |
| 2  |    Muss             |  Funktional    | Als Spieler möchte ich einen neuen Ofen herstellen können, um damit dann Stahl herstellen zu können.                                   |
| 3  |    Muss             |  Funktional    | Als Spieler möchte ich mit Eisen und Koks mit dem neuen Block interagieren können, damit ich damit dann Stahl herstellen kann.    |
| 4  |    Muss             |  Funktional    | Als Spieler möchte ich mit Stahl neue Werkzeuge herstellen, damit ich diese als bessere Eisenalternative verwenden kann.           |
| 5  |    Muss             |  Funktional    | Als Spieler möchte ich mit Stahl neue Rüstungsteile herstellen, damit ich diese als bessere Eisenalternative verwenden kann.            |
| 6  |    Muss             |  Funktional    | Als Spieler möchte ich mit Stahl einen neuen Stahlblock herstellen, damit ich damit schöne Sachen bauen kann.                                |
| 7  |    Muss             |  Funktional    | Als Spieler möchte ich bestehende Rüstungsteile mit Stahl verbessern können, damit diese dann stärker als zuvor sind.               |


### 1.3 Testfälle

Für alle Testfälle ist als Ausgangslage notwendig, dass das Spiel mit der Modifikation gestartet wurde.

| TC-№ | Ausgangslage | Eingabe | Erwartete Ausgabe |
| ---- | ------------ | ------- | ----------------- |
| 1.1  | Ofen geöffnet, Brennstoff eingelegt  |  Kohle in Schmelzfach legen     | Es wird Kohle zu Koks geschmolzen |
| 2.1  | Werkbank geöffnet   |  Eisen, Bruchstein und Glas wird in das Herstellungsfeld gelegt       |  Stahlofen wird ausgegeben |
| 3.1 | Stahlofen platziert  |   Rechtsklick auf Stahlofen  | Stahlofenmenü öffnet sich |
| 3.2 | Stahlofen platziert, Menü geöffnet  |   Koks und Eisen werden eingesetzt  | Stahl wird ausgegeben |
| 4.1 | Stahl hergestellt, Werkbank geöffnet | *Zwei Stöcke und 3 Stahl werden eingelegt* | Stahlspitzhacke wird hergestellt |
| 4.2 | Stahl hergestellt, Werkbank geöffnet | *Ein Stock und 2 Stahl werden eingelegt* | Stahlschwert wird hergestellt |
| 4.3 | Stahl hergestellt, Werkbank geöffnet | *Zwei Stöcke und 2 Stahl werden eingelegt* | Stahlhacke wird hergestellt |
| 4.4 | Stahl hergestellt, Werkbank geöffnet | *Zwei Stöcke und 3 Stahl werden eingelegt* | Stahlaxt wird hergestellt |
| 5.1 | Stahl hergestellt, Werkbank geöffnet | *5 Stahl werden eingelegt* | Stahlhelm wird hergestellt |
| 5.2 | Stahl hergestellt, Werkbank geöffnet | *8 Stahl werden eingelegt* | Stahlbrustpanzer wird hergestellt |
| 5.3 | Stahl hergestellt, Werkbank geöffnet | *7 Stahl werden eingelegt* | Stahlhose wird hergestellt |
| 5.4 | Stahl hergestellt, Werkbank geöffnet | *4 Stahl werden eingelegt* | Stahlschuhe werden hergestellt |
| 6.1 | Stahl hergestellt, Werkbank geöffnet | *9 Stahl werden eingelegt* | Stahlblock wird hergestellt |
| 6.2 | Stahlblock hergestellt | Rechtsklick mit Stahlblock in der Hand | Stahlblock wird platziert |
| 7.1 | Stahl hergestellt, mit Schmiedetisch interagiert | Eisenwerkzeug und Stahl werden in Schmiedetisch gelegt | Eisenwerkzeug wird zu Stahl verbessert |


### 1.4 Diagramme

✍️ Hier können Sie PAPs, Use Case- und Gantt-Diagramme oder Ähnliches einfügen.

#### Items
<img src= "https://github.com/user-attachments/assets/35740aa1-7eb2-42c5-8182-3c10433b951c" width="50" hight="50">
<img src= "https://github.com/user-attachments/assets/64bc790f-2de1-416e-a543-a24aed83171d" width="50" hight="50">
<img src= "https://github.com/user-attachments/assets/f15ebae5-c203-4c33-9b1c-706dcce2f242" width="50" hight="50">

#### Armor
<img src= "https://github.com/user-attachments/assets/b27c1711-ca08-44b0-9842-12782d191cf5" width="50" hight="50">
<img src= "https://github.com/user-attachments/assets/9931ca6b-5b41-4e9a-ba34-e785f00ed579" width="50" hight="50">
<img src= "https://github.com/user-attachments/assets/9c6fe80e-5301-4ed1-9572-090d5a7f9ca1" width="50" hight="50">
<img src= "https://github.com/user-attachments/assets/e4807981-6d92-457c-a4fe-02573b0c5ad2" width="50" hight="50">

#### Armor Layer
<img src= "https://github.com/user-attachments/assets/07c98873-8a80-44e6-b0e3-24365b4c0bc1" width="50" hight="50">
<img src= "https://github.com/user-attachments/assets/1823e17d-38f9-40ed-9bf9-ff7c3a026a3e" width="50" hight="50">

#### Furnace
<img src= "https://github.com/user-attachments/assets/d664f38e-379d-48e8-964d-1a866795c1a1" width="50" hight="50">
<img src="https://github.com/user-attachments/assets/90f00f3e-cc00-433a-a13b-d923cb60bfb5" width="50" height="50">
<img src="https://github.com/user-attachments/assets/8668d747-be07-492d-baaa-176579015e1f" width="50" height="50">
<img src="https://github.com/user-attachments/assets/826b7e6f-714d-4b33-8bd0-5acfbfaf52af" width="50" height="50">

#### Tools




## 2 Planen

| AP-№ | Frist | Zuständig | Beschreibung | geplante Zeit |
| ---- | ----- | --------- | ------------ | ------------- |
| 1.A  |  30.08.24     |  Manuel Jonas Greub         |  Das Item "Koks" wird modelliert.            |       0.5        |
| 1.B  |  30.08.24     |  Manuel Jonas Greub           |  Das Item "Koks" wird dem Spiel hinzugefügt.            |       0.5        |
| 1.C  |  13.09.24     |  Manuel Jonas Greub           |  Das Ofen-rezept für "Koks" wird dem Spiel hinzugefügt. |     0.6      |
| 2.A  |  30.08.24     |  Marek von Rogall           |  Das Item "Stahlofen" wird modelliert. |       0.5    |
| 2.B  |  06.09.24     |  Marek von Rogall         |  Das Item "Stahlofen" wird dem Spiel hinzugefügt. |    1.5       |
| 2.C  |  13.09.24     |  Marek von Rogall           |  Das Herstellungsrezept für den Stahlofen wird dem Spiel hinzugefügt. |     2      |
| 2.D  |  20.09.24     |  Stefan Jesenko & Marek von Rogall |  Der Stahlofen erhält ein GUI. |     3      |
| 3.A  |  30.08.24     |  Manuel Jonas Greub         |  Das Item "Stahl" wird modelliert. |     0.5      |
| 3.B  |  30.08.24     |  Pascal Martin Oestrich     |  Das Item "Stahl" wird dem Spiel hinzugefügt. |    0.5       |
| 3.C  |  13.09.24     |  Pascal Martin Oestrich     |  Das Rezept für den Stahlblock (Werkbank) wird dem Spiel hinzugefügt. |    2       |
| 3.D  |  20.09.24     |  Pascal Martin Oestrich & Marek von Rogall  |  Der Stahlofen erhält die benötigte Logik, um Eisenerz und Kohle beim hineinlegen in Stahl umwandeln zu können. |    3       |
| 4.A  |  30.08.24     |  Stefan Jesenko             |  Die Stahlwerkzeug-Items werden modelliert. |        1   |
| 4.B  |  20.09.24     |  Stefan Jesenko             |  Die Stahlwerkzeuge besitzen höhere Attribute als die Eisenwerkzeuge. |     3      |
| 4.C  |  06.09.24     |  Stefan Jesenko             |  Die Stahlwerkzeuge werden dem Spiel hinzugefügt. |     1      |
| 4.D  |  13.09.24     |  Stefan Jesenko             |  Die Rezepte für Stahlwerkzeuge (Werkbank) werden dem Spiel hinzugefügt. |     0.5      |
| 5.A  |  30.08.24     |  Pascal Martin Oestrich     |  Die Stahlrüstungs-Items werden modelliert. |     1      |
| 5.B  |  20.09.24     |  Pascal Martin Oestrich     |  Die Stahlrüstung besitzt höhere Attribute als die Eisenrüstung. |    1       |
| 5.C  |  06.09.24     |  Pascal Martin Oestrich     |  Die Stahlrüstungs-Items werden dem Spiel hinzugefügt. |    0.5       |
| 5.D  |  13.09.24     |  Pascal Martin Oestrich     |  Die Rezepte für Stahlrüstung (Werkbank) werden dem Spiel hinzugefügt. |    1       |
| 6.A  |  30.08.24     |  Manuel Jonas Greub         |  Das Item "Stahlblock" wird modelliert. |     0.5      |
| 6.B  |  06.09.24     |  Marek von Rogall           |  Das Item "Stahlblock" wird dem Spiel hinzugefügt. |    0.5       |
| 6.C  |  13.09.24     |  Manuel Jonas Greub         |  Das  Herstellungsrezept für den Stahlblock wird dem Spiel hinzugefügt. |     0.5  |    
| 7.A  |  13.09.24     |  Manuel Jonas Greub         |  Die Rezepte für Stahlrüstung (Schmiedetisch) werden dem Spiel hinzugefügt. |     1      |
| 7.B  |  13.09.24     |  Stefan Jesenko             |  Die Rezepte für Stahlwerkzeuge (Schmiedetisch) werden dem Spiel hinzugefügt. |     1      |

1 Arbeitsblock = 45 Minuten

Total: 27.1 Arbeitsblöcke = 1’219.5 Minuten

## 3 Entscheiden

✍️ Dokumentieren Sie hier Ihre Entscheidungen und Annahmen, die Sie im Bezug auf Ihre User Stories und die Implementierung getroffen haben.

## 4 Realisieren

| AP-№ | Datum       | Zuständig                     | geplante Zeit | tatsächliche Zeit |
| ---- | ----------- | ----------------------------- | ------------- | ----------------- |
| 1.A  | 30.08.2024  | Manuel Jonas Greub            | 0.5           | 0.5               |
| 1.B  | 30.08.2024  | Manuel Jonas Greub            | 0.5           | 0.5               |
| 1.C  | 13.09.2024  | Manuel Jonas Greub            | 0.6           |                   |
| 2.A  | 30.08.2024  | Marek von Rogall              | 0.5           | 0.5               |
| 2.B  | 06.09.2024  | Marek von Rogall              | 1.5           | 1.5               |
| 2.C  | 13.09.2024  | Marek von Rogall              | 2             |                   |
| 2.D  | 20.09.2024  | Stefan Jesenko & Marek von Rogall | 3         |                   |
| 3.A  | 30.08.2024  | Manuel Jonas Greub            | 0.5           |                   |
| 3.B  | 30.08.2024  | Pascal Martin Oestrich        | 0.5           |    0.5               |
| 3.C  | 13.09.2024  | Pascal Martin Oestrich        | 2             |                   |
| 3.D  | 20.09.2024  | Pascal Martin Oestrich & Marek von Rogall | 3   |                   |
| 4.A  | 30.08.2024  | Stefan Jesenko                | 1             |                   |
| 4.B  | 20.09.2024  | Stefan Jesenko                | 3             |                   |
| 4.C  | 06.09.2024  | Stefan Jesenko                | 1             |                   |
| 4.D  | 13.09.2024  | Stefan Jesenko                | 0.5           |                   |
| 5.A  | 30.08.2024  | Pascal Martin Oestrich        | 1             |      1             |
| 5.B  | 20.09.2024  | Pascal Martin Oestrich        | 1             |                   |
| 5.C  | 06.09.2024  | Pascal Martin Oestrich        | 0.5           |                   |
| 5.D  | 13.09.2024  | Pascal Martin Oestrich        | 1             |                   |
| 6.A  | 30.08.2024  | Manuel Jonas Greub            | 0.5           |                   |
| 6.B  | 06.09.2024  | Marek von Rogall              | 0.5           |     0.3           |
| 6.C  | 13.09.2024  | Manuel Jonas Greub            | 0.5           |                   |
| 7.A  | 13.09.2024  | Manuel Jonas Greub            | 1             |                   |
| 7.B  | 13.09.2024  | Stefan Jesenko                | 1             |                   |


✍️ Tragen Sie jedes Mal, wenn Sie ein Arbeitspaket abschließen, hier ein, wie lang Sie effektiv dafür hatten.

## 5 Kontrollieren

### 5.1 Testprotokoll

| TC-№ | Datum | Resultat | Tester |
| ---- | ----- | -------- | ------ |
| 1.1  |       |          |        |
| ...  |       |          |        |

✍️ Vergessen Sie nicht, ein Fazit hinzuzufügen, welches das Test-Ergebnis einordnet.

### 5.2 Exploratives Testen

| BR-№ | Ausgangslage | Eingabe | Erwartete Ausgabe | Tatsächliche Ausgabe |
| ---- | ------------ | ------- | ----------------- | -------------------- |
| I    |              |         |                   |                      |
| ...  |              |         |                   |                      |

✍️ Verwenden Sie römische Ziffern für Ihre Bug Reports, also I, II, III, IV etc.

## 6 Auswerten

✍️ Fügen Sie hier eine Verknüpfung zu Ihrem Lern-Bericht ein.
