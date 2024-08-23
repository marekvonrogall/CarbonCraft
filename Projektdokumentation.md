# Projekt-Dokumentation

Gruppenname: Hunt: Showdown 1896

| Datum | Version | Zusammenfassung                                              |
| ----- | ------- | ------------------------------------------------------------ |
|  23.208.2024     | 0.0.1   | Heute haben wir das Projekt aufgesetzt und auf GitHub geladen. Projektdokumentation aufgesetzt. |
|       | ...     |                                                              |
|       | 1.0.0   |                                                              |

## 1 Informieren

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
| 1.1  | Ofen geöffnet, Brennstoff eingelegt  |  Kohle in Schmelzfach legen     | *Es wird Kohle zu Koks geschmolzen* |
| 2.1  | Minecraft Mod gestartet Stahlofne geöffnet             |  linkes Feld (Kohle) rechtes Feld (Holzkohle)       |  *Output (Koks)* |
| 2.2 | Minecraft Mod gestartet Stahlofne geöffnet  |   linkes Feld (Iron Ingot) rechtes Feld (Koks)  | *Output (Stahl)* |
| 3.1 | Minecraft Mod gestartet Craftingtable geöffnet|  Sword recipe with steel | Output (steel sword) |
| 4.1 | Minecraft Mod gestartet Craftingtable geöffnet | Pickaxe recipe | Output (steel pickaxe) |
| ... |  |   |  |
| ... |  |   |  |


✍️ Die Nummer hat das Format `N.m`, wobei `N` die Nummer der User Story ist, die der Testfall abdeckt, und `m` von `1` an nach oben gezählt. Beispiel: Der dritte Testfall, der die zweite User Story abdeckt, hat also die Nummer `2.3`.

### 1.4 Diagramme

✍️ Hier können Sie PAPs, Use Case- und Gantt-Diagramme oder Ähnliches einfügen.

## 2 Planen

| AP-№ | Frist | Zuständig | Beschreibung | geplante Zeit |
| ---- | ----- | --------- | ------------ | ------------- |
| 1.A  |       |           |              |               |
| ...  |       |           |              |               |

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
