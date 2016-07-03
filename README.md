
 ==================================================
 	Chronos
 	Herman Slatman & Martijn Roo
 	Vertalerbouw (192110352) 2012-2013
 	Universiteit Twente
 ==================================================
 
 
 INSTALLATIE
 -------------------------
 De gehele compiler is in Chronos.jar ingepakt. Deze .jar bevat daarnaast ook
 de compilers voor TAM en Jasmin, en ook de TAM Interpreter is bijgevoegd.
 Zie de sectie GEBRUIK hoe deze .jar te gebruiken.
 
 Verder kan het Java project in Eclipse geïmporteerd worden. Alle source is 
 beschikbaar in de \src folder. De Chronos compiler bevat een mainklasse 
 chronos.Chronos, die de compiler omvat. Daarnaast is er een mainklasse 
 chronos.test.ChronosTester die alle tests in de \tests folder zal draaien. 
 \bin bevat uiteraard de uitvoerbare bestanden. \build bevat Chronos.jar, die
 de gehele compiler bevat. \lib bevat de .jars voor Jasmin, TAM en ANTLR.
 \doc tenslotte, bevat de Javadoc van het project.
 
 Chronos is ontwikkeld op JDK 7; het kan mogelijk zijn dat de vertaler enkel
 op Java SE7 draait.
 
 
 GEBRUIK
 -------------------------
 tl;dr
 $ java -jar Chronos.jar pad/naar/een/chronos/programma
 $ java -cp Chronos.jar TAM.Interpreter pad/naar/een/chronos/programma.tam
 
 De compiler kan aangeroepen worden door $ java -jar Chronos.jar aan te roepen, met
 een pad naar een te compileren bestand als verplicht argument. Standaard zal de 
 compiler een .tasm bestand creëren op dezelfde lokatie als het inputbestand.
 Na het generereren van de TAM code in het .tasm bestand, wordt automatisch de 
 TAM Assembler aangeroepen, die de TAM code automatisch doorcompileert naar 
 TAM bytecode. Het resultaat is een .tam bestand. Dit .tam bestand kan met de 
 TAM Interpreter worden gedraaid; TAM Interpreter zit in Chronos.jar verwerkt.
 
 $ java -cp Chronos.jar TAM.Interpreter pad/naar/een/chronos/programma.tam
 
 Er zijn enkele commandline opties aanwezig die, bij gebruik ervan, voor extra 
 functionaliteit zorgen. Deze commandline opties zijn hieronder weergegeven.
 
 
 COMMANDLINE OPTIES
 -------------------------
 -logfile	Output log gegevens naar chronos-debug.log
			Standaard print de logger naar System.err, maar door van deze
			optie gebruik te maken, zullen logberichten naar chronos-debug.log
			geschreven worden.
			
 -nofile	Output van code generatie naar standaard out; meestal de console.
			Dit heeft tot gevolg dat alle code enkel naar de standaard output
			gaat; er zal dus geen (nieuw) bestand aangemaakt worden.
			
 -jasm		Genereer Jasmin code i.p.v. TAM code.
			Indien deze optie in combinatie met -nofile gebruikt wordt, zal 
			er Jasmin code naar standaard output geprint worden.
			Als deze optie niet in combinatie met -nofile gebruikt wordt,
			zal er een .jasm bestand aangemaakt worden op dezelfde lokatie
			als het inputbestand. Dit bestand bevat Jasmin code. Dit bestand
			dient handmatig verder gecompileerd te worden naar een Java klasse.
			Ook de Jasmin compiler bevindt zich in Chronos.jar, dus kan het
			programma gecompileerd worden naar een Java klasse door
			$ java -cp Chronos.jar jasmin.Main Programma.jasm aan te roepen. 
			Het Java programma kan vervolgens uitgevoerd worden door 
			$ java Programma aan te roepen.
