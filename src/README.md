OOP próba modulzáró

Készíts egy új, verziókezelt projektet!
A feladatotkat külön-külön package-ekben oldd meg, ezeket a package-eket neked kell létrehoznod! (Mindegyik package-ed tartalmazhat main() metódust, ahol tesztelhetsz, de nem kötelező.)
Ha kész vagy, pushold fel a megoldásaid (természetesen előbb is pusholhatsz) és küldd el Andrisnak a repód linkjét!
text package
Vegyél fel egy Text nevű osztályt!
Írj egy metódust,
amit az osztály példányosítása nélkül lehet használni
bemenetként kap egy Stringekből álló Listát
ezt a bemenetként kapott listát módosítja az alábbi szabály szerint:
ha a String 25 karakternél  hosszabb, akkor csak 20 karaktert tartson meg belőle és a végére írjon három pontot!
(a 25 karakternél rövidebb Stringeket nem módosítjuk)
Ügyelj arra, hogy a paraméterként kapott listát kell, hogy módosítsd, nem pedig egy új listával visszatérni!

A metódusod leteszteléséhez írj a Text osztályban egy main metódust!
A String listát ne List.of()-fal hoz létre, mert az immutable (módosíthatatlan) listát eredményezne, hanem például az alábbi módon:


List<String> szovegek = new ArrayList<>(Arrays.asList(
"Ez egy rövid szöveg.",
"Ez egy hosszú szöveg, aminek a hossza több mint 25 karakter.",
"Ez is egy rövid szöveg.",
"Ez szintén egy hosszú szöveg, mert több, mint 25 karakter."
));

Pontozás: 6p
metódus szignatúrája (visszatérési érték, egyéb modifierek, paraméterlista) 3p
metódus logikája 3p

address package
Szeretném tárolni alkalmazottak adatait, erre létrehozok egy osztályt.
Ebben az osztályban cím(ek)et is szeretnék eltárolni az alkalmazottakhoz, méghozzá részletesen: pl. ország, irányítószám, utca, emelet, stb. A címekből több is lehet egy alkalmazotthoz.
Csináld meg a kigondolt osztálystruktúrát, lásd el a szükséges metódusokkal!
Ügyelj arra, hogy betartsd az OOP koncepcióit, az osztályod zárt legyen és csak metódusokkal tudj címeket hozzáadni ill. a címeket lekérdezni!
Az alkalmazottak többi adatával nem kell foglalkoznod, elég csak a címek nyilvántartását megvalósítani.

Pontozás: 7p
adatstruktúra 4p
metódusok 3p
animal package
Írj egy programot, ami cirkuszi állatokat szimulál!
A cirkuszban vannak elefántok, oroszlánok és fókák.
Ezen állatok születésükkör kapnak egy nevet, mely a későbbiekben már nem módosulhat.
(Garantáld ezt a működést a kódodban!)
Életük folyamán viszont kaphatnak beceneveket, amelyekből egyszerre több is lehet az adott állatnak. Ezen becenevek nem fognak “kikopni”, tehát nem lesznek eltávolítva, örökké az állatokkal maradnak. (A kódodban lehessen egyesével hozzáadni becenevet állatokhoz, illetve lekérdezni az összes becenevét az állatnak.)
Minden állat tud hangot kiadni, csak mindegyik másképp, valósítsd meg ezt a működést is!
A programod továbbá legyen képes eltárolni, hogy hány darab állat lett “létrehozva” a cirkuszban!
Hozd létre az OOP koncepcióit szem előtt tartva ezt az osztálystruktúrát!

Pontozás: 6p
OOP koncepciók követése 2p
név 2p
becenevek 2p
példányszám 2p
family package

Családfa ábrázolására írj programot, amiben relációk mentén építhetsz fel anyai és apai kapcsolatokat! A program legyen képes a családfa kiíratására apai vagy anyai vonalon mozogva!

Pl. Alma családfája anyai ágon mozogva
Alma szülei Béla és Cecil, akinek szülei Dénes és Emőke, akinek szülei Ferenc és Gyöngyi

Kimenet:
Alma
Béla - Cecil
Dénes - Emőke
Ferenc -  Gyöngyi

Pontozás: 8p
