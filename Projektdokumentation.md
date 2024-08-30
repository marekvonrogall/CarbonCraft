# Projekt-Dokumentation

Gruppenname: Hunt: Showdown 1896

| Datum | Version | Zusammenfassung                                              |
| ----- | ------- | ------------------------------------------------------------ |
|  23.208.2024     | 0.0.1   | Heute haben wir das Projekt aufgesetzt und auf GitHub geladen. Projektdokumentation aufgesetzt. |
|       | ...     |                                                              |
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


✍️ Die Nummer hat das Format `N.m`, wobei `N` die Nummer der User Story ist, die der Testfall abdeckt, und `m` von `1` an nach oben gezählt. Beispiel: Der dritte Testfall, der die zweite User Story abdeckt, hat also die Nummer `2.3`.

### 1.4 Diagramme

✍️ Hier können Sie PAPs, Use Case- und Gantt-Diagramme oder Ähnliches einfügen.

## 2 Planen

| AP-№ | Frist | Zuständig | Beschreibung | geplante Zeit |
| ---- | ----- | --------- | ------------ | ------------- |
| 1.A  |  30.08.24     |  Manuel Jonas Greub         |  Das Item "Koks" wird modelliert.            |               |
| 1.B  |  30.08.24     |  Manuel Jonas Greub           |  Das Item "Koks" wird dem Spiel hinzugefügt.            |               |
| 1.C  |  13.09.24     |  Manuel Jonas Greub           |  Das Ofen-rezept für "Koks" wird dem Spiel hinzugefügt. |           |
| 2.A  |  30.08.24     |  Marek von Rogall           |  Das Item "Stahlofen" wird modelliert. |           |
| 2.B  |  06.09.24     |  Marek von Rogall         |  Das Item "Stahlofen" wird dem Spiel hinzugefügt. |           |
| 2.C  |  13.09.24     |  Marek von Rogall           |  Das Herstellungsrezept für den Stahlofen wird dem Spiel hinzugefügt. |           |
| 2.D  |  20.09.24     |  Stefan Jesenko & Marek von Rogall |  Der Stahlofen erhält ein GUI. |           |
| 3.A  |  30.08.24     |  Manuel Jonas Greub         |  Das Item "Stahl" wird modelliert. |           |
| 3.B  |  30.08.24     |  Pascal Martin Oestrich     |  Das Item "Stahl" wird dem Spiel hinzugefügt. |           |
| 3.C  |  13.09.24     |  Pascal Martin Oestrich     |  Das Rezept für Stahl (Werkbank) wird dem Spiel hinzugefügt. |           |
| 3.D  |  20.09.24     |  Pascal Martin Oestrich & Marek von Rogall  |  Der Stahlofen erhält die benötigte Logik, um Eisenerz und Kohle beim hineinlegen in Stahl umwandeln zu können. |           |
| 4.A  |  30.08.24     |  Stefan Jesenko             |  Die Stahlwerkzeug-Items werden modelliert. |           |
| 4.B  |  20.09.24     |  Stefan Jesenko             |  Die Stahlwerkzeuge besitzen höhere Attribute als die Eisenwerkzeuge. |           |
| 4.C  |  06.09.24     |  Stefan Jesenko             |  Die Stahlwerkzeuge werden dem Spiel hinzugefügt. |           |
| 4.D  |  13.09.24     |  Stefan Jesenko             |  Die Rezepte für Stahlwerkzeuge (Werkbank) werden dem Spiel hinzugefügt. |           |
| 5.A  |  30.08.24     |  Pascal Martin Oestrich     |  Die Stahlrüstungs-Items werden modelliert. |           |
| 5.B  |  20.09.24     |  Pascal Martin Oestrich     |  Die Stahlrüstung besitzt höhere Attribute als die Eisenrüstung. |           |
| 5.C  |  06.09.24     |  Pascal Martin Oestrich     |  Die Stahlrüstungs-Items werden dem Spiel hinzugefügt. |           |
| 5.D  |  13.09.24     |  Pascal Martin Oestrich     |  Die Rezepte für Stahlrüstung (Werkbank) werden dem Spiel hinzugefügt. |           |
| 6.A  |  30.08.24     |  Manuel Jonas Greub         |  Das Item "Stahlblock" wird modelliert. |           |
| 6.B  |  06.09.24     |  Marek von Rogall           |  Das Item "Stahlblock" wird dem Spiel hinzugefügt. |           |
| 6.C  |  13.09.24     |  Manuel Jonas Greub         |  Das  Herstellungsrezept für den Stahlblock wird dem Spiel hinzugefügt. |           
| 7.A  |  13.09.24     |  Manuel Jonas Greub         |  Die Rezepte für Stahlrüstung (Schmiedetisch) werden dem Spiel hinzugefügt. |           |
| 7.B  |  13.09.24     |  Stefan Jesenko             |  Die Rezepte für Stahlwerkzeuge (Schmiedetisch) werden dem Spiel hinzugefügt. |           |

Total: 

✍️ Die Nummer hat das Format `N.m`, wobei `N` die Nummer der User Story ist, auf die sich das Arbeitspaket bezieht, und `m` von `A` an nach oben buchstabiert. Beispiel: Das dritte Arbeitspaket, das die zweite User Story betrifft, hat also die Nummer `2.C`.

✍️ Ein Arbeitspaket sollte etwa 45' für eine Person in Anspruch nehmen. Die totale Anzahl Arbeitspakete sollte etwa Folgendem entsprechen: `Anzahl R-Sitzungen` ╳ `Anzahl Gruppenmitglieder` ╳ `4`. Wenn Sie also zu dritt an einem Projekt arbeiten, für welches zwei R-Sitzungen geplant sind, sollten Sie auf `2` ╳ `3` ╳`4` = `24` Arbeitspakete kommen. Sollten Sie merken, dass Sie hier nicht genügend Arbeitspakte haben, denken Sie sich weitere "Kann"-User Stories für Kapitel 1.2 aus.

## 3 Entscheiden

✍️ Dokumentieren Sie hier Ihre Entscheidungen und Annahmen, die Sie im Bezug auf Ihre User Stories und die Implementierung getroffen haben.

## 4 Realisieren

| AP-№ | Datum | Zuständig | geplante Zeit | tatsächliche Zeit |
| ---- | ----- | --------- | ------------- | ----------------- |
| 1.A  |       |           |               |                   |
| ...  |       |           |               |                   |

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
