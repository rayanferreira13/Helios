package service;

import entite.Etudiant;
import entite.Formation;
import entite.Module;
import repository.EtudiantRepository;
import repository.EtudiantRepositoryItf;
import repository.FormationRepository;
import repository.ModuleRepository;
import repository.ModuleRepositoryItf;

public class InitialisationDonnees {

	public static void main(String[] args) {
		Formation slam1 = new Formation("SLAM1", "Bts Sio SLAM premi�re ann�e",780);
	    slam1.setDescription(
	    		"	Participer � la production et � la fourniture de services en d�veloppant, en adaptant ou en maintenant des\r\n " +
	    		"	solutions applicatives.\n" +
	    	    "	Elle intervient plus particuli�rement dans :\r\n" + 
	    		"	La d�finition des sp�cifications techniques � partir de l�expression des besoins des utilisateurs et des \r\n" +
	    	    "	contraintes de l�organisation pr�alablement recens�s, notamment li�es � la s�curit�,\r\n" + 
	    		"	La r�alisation, l�adaptation, la s�curisation puis la validation de solutions applicatives � l�aide des cadres \r\n" +
	    	    "	applicatifs (frameworks) retenus,\r\n" + 
	    		"	La gestion du patrimoine applicatif,\r\n" + 
	    		"	La r�daction de la documentation d�une solution applicative,\r\n" + 
	    		"	La recherche de r�ponses adapt�es � des probl�mes li�s � la fourniture et � la s�curisation des services informatiques,\r\n" + 
	    		"	L�accompagnement et l�assistance des utilisateurs,\r\n" + 
	    		"	Le maintien de la qualit� des services applicatifs.");
	    Formation slam2 = new Formation("SLAM2", "Bts Sio SLAM deuxi�me ann�e", 890);
	    slam2.setDescription(
	    		"	Participer � la production et � la fourniture de services en d�veloppant, en adaptant ou en maintenant des solutions \n" +
	    		"	applicatives.\r\n " +
	    	    "	Elle intervient plus particuli�rement dans :" + 
	    		"	La d�finition des sp�cifications techniques � partir de l�expression des besoins des utilisateurs et des contraintes\r\n" +
	    	    "	de l�organisation pr�alablement recens�s,notamment li�es � la s�curit�\r\n" + 
	    		"	La r�alisation, l�adaptation, la s�curisation puis la validation de solutions applicatives � l�aide des cadres\r\n" +
	    	    "	applicatifs (frameworks) retenus,\r\n" + 
	    		"	La gestion du patrimoine applicatif,\r\n" + 
	    		"	La r�daction de la documentation d�une solution applicative,\r\n" + 
	    		"	La recherche de r�ponses adapt�es � des probl�mes li�s � la fourniture et � la s�curisation des services informatiques,\r\n" + 
	    		"	L�accompagnement et l�assistance des utilisateurs,\r\n" + 
	    		"	Le maintien de la qualit� des services applicatifs.");
	    Formation sisr1 = new Formation("SISR1", "Bts Sio SISR premi�re ann�e", 780);
	    sisr1.setDescription(
	    		"    Participer � la production et � la fourniture de services en r�alisant ou en adaptant des solutions d�infrastructure \r\n" +
	    		"    et en assurant le fonctionnement optimal des �quipements et des services informatiques\r\n" + 
	    		"    Intervenir plus particuli�rement dans : \r\n" + 
	    		"    L�installation, l�int�gration, l�administration, la s�curisation des �quipements et des services informatiques,\r\n" + 
	    		"    L�exploitation, la supervision et la maintenance d'une infrastructure syst�mes et r�seaux,\r\n" + 
	    		"    Le choix et la mise en �uvre de solutions d�h�bergement,\r\n" + 
	    		"    La d�finition et la configuration des postes clients, des serveurs et des �quipements d�interconnexion, leur d�ploiement \n" + 
	    		"    et leur maintenance.\r\n" + 
	    		"    La gestion des actifs de l�infrastructure,\r\n" + 
	    		"    La recherche de r�ponses adapt�es � des besoins d��volution de l�infrastructure ou � des probl�mes li�s � la mise � \n" + 
	    		"    disposition des services informatiques,\r\n" + 
	    		"    La r�solution des incidents et l�assistance des utilisateurs,\r\n" + 
	    		"    Le maintien de la qualit� des services informatiques,\r\n" + 
	    		"    La d�tection, la r�action et l�investigation pour donner suite � un incident de s�curit�.\r\n");
	    Formation sisr2 = new Formation("SISR2", "Bts Sio SLAM deuxi�me ann�e", 890);
	    sisr2.setDescription(
	    		"	Participer � la production et � la fourniture de services en r�alisant \n" + 
	    		"	ou en adaptant des solutions d�infrastructure et en assurant le fonctionnement\n" +
	    		"	optimal des �quipements et des services informatiques\r\n" + 
	    		"	Intervenir plus particuli�rement dans : \r\n" + 
	    		"	L�installation, l�int�gration, l�administration, la s�curisation des �quipements \n" +
	    		"	et des services informatiques,\r\n" + 
	    		"	L�exploitation, la supervision et la maintenance d'une infrastructure syst�mes et r�seaux,\r\n" + 
	    		"	Le choix et la mise en �uvre de solutions d�h�bergement,\r\n" + 
	    		"	La d�finition et la configuration des postes clients, des serveurs et des �quipements d�interconnexion,\r\n" +
	    		"	leur d�ploiement et leur maintenance,\r\n" + 
	    		"	La gestion des actifs de l�infrastructure,\r\n" + 
	    		"	La recherche de r�ponses adapt�es � des besoins d��volution de l�infrastructure ou � des probl�mes li�s � \r\n" +
	    		"	la mise � disposition des services informatiques,\r\n" + 
	    		"	La r�solution des incidents et l�assistance des utilisateurs,\r\n" + 
	    		"	Le maintien de la qualit� des services informatiques,\r\n" + 
	    		"	La d�tection, la r�action et l�investigation pour donner suite � un incident de s�curit�.\r\n");
	    Formation unum3 = new Formation("INUM3", "Ing�nieur du num�rique quatri�me ann�e", 840);
	    unum3.setDescription(
	    		"	L'ing�nieur en �lectronique num�rique con�oit des circuits imprim�s, \n" + 
	    		"	utilisant des puces �lectroniques programmables et d'autres composants. \n" + 
	    		"	Ces montages �lectroniques se trouvent dans de nombreux produits et applications : \r\n" + 
	    		"	consoles de jeux, pass transport sans contact, drones, t�l�phones portables, etc. \r\n" + 
	    		"	Lors de la conception, il s'appuie sur un cahier des charges. \r\n" + 
	    		"	Il d�finit ensuite l'architecture mat�rielle et fonctionnelle de la partie num�rique \r\n" + 
	    		"	du syst�me �lectronique, puis il choisit les composants et d�termine leur organisation.");
	    Formation unum4 = new Formation("INUM4", "Ing�nieur du num�rique quatri�me ann�e", 860);
	    unum4.setDescription(
	    		"	Les majeures propos�es permettent de se sp�cialiser et d�approfondir \r\n" + 
	    		"	des comp�tences m�tiers (300h).\r\n" + 
	    		"	Cybers�curit� et r�seaux\r\n" + 
	    		"	Objets connect�s et syst�mes intelligents\r\n" + 
	    		"	Big Data & Data Science\r\n" + 
	    		"	Intelligence artificielle\r\n" + 
	    		"	Transition num�rique");
	    Formation unum5 = new Formation("INUM5", "Ing�nieur du num�rique cinqui�me ann�e", 560);
	    unum5.setDescription(
	    		"	Comp�tences acquises\r\n" + 
	    		"	Savoir mettre en �uvre un dispositif de r�alit� virtuelle et de r�alit� augment�e\r\n" + 
	    		"	Savoir mettre en �uvre une application permettant de r�pondre � un besoin industriel\r\n" + 
	    		"	Savoir mettre en �uvre un protocole exp�rimental de validation de m�thodes et \r\n" +
	    		"	outils de r�alit� virtuelle/r�alit� augment�e (savoir d�velopper une d�marche scientifique).\r\n" + 
	    		"	Savoir d�velopper et g�rer un projet de recherche et d�veloppement, en lien \r\n" + 
	    		"	avec des entreprises");
	    
	    
	    FormationRepository formationRepository = new FormationRepository();
	    EtudiantRepositoryItf etudiantRepository = new EtudiantRepository();
	    ModuleRepositoryItf moduleRepository = new ModuleRepository();
	    ServiceItf service = new Service(formationRepository, etudiantRepository, moduleRepository);
	    service.create(slam1);
	    service.create(slam2);
	    service.create(sisr1);
	    service.create(sisr2);
	    service.create(unum3);
	    service.create(unum4);
	    service.create(unum5);
	    
	    Etudiant maiga = new Etudiant("Maiga","Fouseini","12 rue du bonheur 13013 Marseille", "0345678909", "maiga@mail.com"); 
	    Etudiant diallo = new Etudiant("Diallo","Mamoudou","14 rue de la vie 13013 Marseille", "0645678468", "diallo@mail.com"); 
	    Etudiant hugo = new Etudiant("Hugo","Victor","24 rue du soleil 13013 Marseille", "06465890", "hugo@mail.com"); 
	    Etudiant proust = new Etudiant("Proust","Marcel","34 rue de la lune 13013 Marseille", "0687946324", "proust@mail.com"); 
	    Etudiant djian = new Etudiant("Djian","Philippe","23 rue marguerite  13013 Marseille", "0612345676", "djian@mail.com"); 
	    Etudiant zidane = new Etudiant("Zidane","Zinedine","14 rue tournesol 13013 Marseille", "0678436709", "zidane@mail.com"); 
	    Etudiant balzac = new Etudiant("De Balzac","honor�","15 rue de la rose 13013 Marseille", "0784675844", "balzac@mail.com"); 
	    Etudiant camus = new Etudiant("Camus","Albert","16 rue valentin 13013 Marseille", "0876574822", "camus@mail.com"); 
	    Etudiant zola = new Etudiant("Zola","Emile","12 rue du bonheur 13013 Marseille", "02468024", "zola@mail.com"); 
	    Etudiant sartre = new Etudiant("Sartre","Jean-Paul","69 rue du bocage 13013 Marseille", "0345678909", "sartre@mail.com"); 
	    Etudiant rabelais = new Etudiant("Rabelais","Fran�ois","67 rue bovin 13013 Marseille", "08695847", "rabelais@mail.com"); 
	    Etudiant sand = new Etudiant("Sand","Goarges","26 rue castafiore 13013 Marseille", "0234567890", "sand@mail.com"); 
	    Etudiant shakespeare = new Etudiant("Shakespeare","William","14 rue de la soif 13013 Marseille", "0123456789", "shakespeare@mail.com"); 
	    Etudiant baudelaire = new Etudiant("Baudelaire","Charles","98 rue du palais 13013 Marseille", "0457382904", "baudelaire@mail.com");  
	    Etudiant dumas = new Etudiant("Dumas","Alexandre","46 rue de l'entrain 13013 Marseille", "0987654321", "dumas@mail.com"); 
	    Etudiant appolinaire = new Etudiant("Appolinaire","Guillaume","53 rue du retour 13013 Marseille", "0239467412", "appolinaire@mail.com"); 
	    Etudiant flaubert = new Etudiant("Flaubert","Gustave","58 rue druot 13013 Marseille", "04566783920", "flaubert@mail.com"); 
	    Etudiant rousseau = new Etudiant("Rousseau","Jean-Jacques","68 rue lindet 13013 Marseille", "0135860456", "rousseau@mail.com"); 
	    Etudiant yourcenar = new Etudiant("Yourcenar","Marguerite","35 rue de la pompe 13013 Marseille", "0192837465", "yourcenar@mail.com"); 
	    Etudiant eluard = new Etudiant("Eluard","Paul","90 rue du mar�chal 13013 Marseille", "02938475610", "eluard@mail.com"); 
	    Etudiant aragon = new Etudiant("Aragon","Louis","56 rue s�r�nit� 13013 Marseille", "0345678909", "maiga@mail.com"); 
	    Etudiant prevert = new Etudiant("Pr�vert","Jacques","96 rue du d�passement 13013 Marseille", "0695847362", "aragon@mail.com"); 
	    Etudiant desnos = new Etudiant("Desnos","Robert","63 rue de la renaissance 13013 Marseille", "0796859403", "desnos@mail.com"); 
	    Etudiant breton = new Etudiant("Breton","Andr�","14 rue du coq 13013 Marseille", "0283745682", "breton@mail.com"); 
	    Etudiant queneau = new Etudiant("Queneau","Raymond","17 rue ariel 13013 Marseille", "0195738465", "queneau@mail.com"); 
	    Etudiant mercoeur = new Etudiant("Mercoeur","Elisa","26 rue dindon 13013 Marseille", "098049586", "mercoeur@mail.com"); 
	    Etudiant labe = new Etudiant("Lab�","Louise","18 rue du chemin vert 13013 Marseille", "0493867244", "labe@mail.com"); 
	    Etudiant vivien = new Etudiant("Vivien","Ren�e","12 rue de la coul�e rouge 13013 Marseille", "0691029384", "vivien@mail.com"); 
	    
	    service.inscrire(maiga, "SLAM2");
	    service.inscrire(diallo, "SLAM2");
	    service.inscrire(hugo, "SLAM2");
	    service.inscrire(proust, "SLAM2");
	    service.inscrire(djian, "SLAM1");
	    service.inscrire(zidane, "SLAM1");
	    service.inscrire(balzac, "SLAM2");
	    service.inscrire(camus, "SLAM2");
	    service.inscrire(zola, "SLAM1");
	    service.inscrire(sartre, "SLAM1");
	    service.inscrire(rabelais, "SLAM1");
	    service.inscrire(sand, "SLAM1");
	    service.inscrire(shakespeare, "SLAM2");
	    service.inscrire(baudelaire, "SLAM2");
	    service.inscrire(dumas, "SLAM1");
	    service.inscrire(appolinaire, "SLAM1");
	    service.inscrire(flaubert, "SISR1");
	    service.inscrire(rousseau, "SISR1");
	    service.inscrire(yourcenar, "SISR1");
	    service.inscrire(eluard, "SISR2");
	    service.inscrire(aragon, "SISR2");
	    service.inscrire(prevert, "SISR2");
	    service.inscrire(desnos, "SISR2");
	    service.inscrire(breton, "SISR2");
	    service.inscrire(queneau, "INUM3");
	    service.inscrire(mercoeur, "INUM3");
	    service.inscrire(labe, "INUM4");
	    service.inscrire(vivien, "INUM4");
	    
	    Module math = new Module("Math�matiques pour l�informatique", "Monsieur Thales",
	    		"Comprendre et  r�soudre  les  probl�mes  math�matiques  �l�mentaires  auxquels  une  personne \r\n" + 
	    		"informaticienne  est  couramment  confront�e  (calcul  binaire,  masque  de  r�seau,  op�rateurs \r\n" + 
	    		"logiques�)\r\n" + 
	    		"Comprendre et manipuler les objets math�matiques fr�quemment utilis�s en programmation, \r\n" + 
	    		"de mani�re � pouvoir exploiter informatiquement une  solution math�matique pr�alablement \r\n" + 
	    		"construite\r\n" + 
	    		"R�soudre  des  probl�mes  num�riques  n�cessitant  la  mise  en  �uvre  d'algorithmes  qu'il  s'agit  de \r\n" + 
	    		"construire, de mettre en forme et dont on comparera �ventuellement les performances", 
	    		84);
	    
	    Module ecjma = new Module("Culture �conomique, juridique et manag�riale", "Madame De Beauvoir",
	    		"Capacit�s � : \r\n" + 
	    		"-      analyser des situations auxquelles l�entreprise est confront�e ;\r\n" + 
	    		"-      exploiter une base documentaire �conomique, juridique ou manag�riale ;\r\n" + 
	    		"-      proposer   des   solutions   argument�es   et   mobilisant   des   notions   et   les   m�thodologies \r\n" + 
	    		"�conomiques, juridiques ou manag�riales adapt�es aux situations propos�es ;\r\n" + 
	    		"-      �tablir un diagnostic (ou une partie de diagnostic) pr�parant une prise de d�cision strat�gique ;\r\n" + 
	    		"-      exposer ses analyses et ses propositions de mani�re coh�rente et argument�e.", 
	    		62);
	    
	    Module langue2 = new Module("Bloc facultatif - Langue vivante 2", "Madame Tatcher",
	    		"Niveau B1 du CECRL pour les activit�s langagi�res suivantes :\r\n" + 
	    		"-      compr�hension de documents �crits ;\r\n" + 
	    		"-      production et interaction �crites ;\r\n" + 
	    		"-      compr�hension de l�oral ;\r\n" + 
	    		"-      production et interaction orales.", 
	    		48);
	    
	    Module mathAppro = new Module("Math�matiques approfondies", "Georges Sand", 
	    		"Capacit�s � :\r\n" + 
	    		"-      s�informer sur les outils math�matiques ;\r\n" + 
	    		"-      chercher en utilisant les outils math�matiques ;\r\n" + 
	    		"-      raisonner et argumenter � l�aide d�outils math�matiques ;\r\n" + 
	    		"-      effectuer des calculs relevant des math�matiques approfondies avec une calculatrice et  d�autres \r\n" + 
	    		"moyens informatiques ;\r\n" + 
	    		"-      mod�liser, interpr�ter et communiquer sur les r�sultats ainsi obtenus.", 
	    		82);
	    
	    Module serviceInfo = new Module("Support et mise � disposition de services informatiques", "Monsoeur Lagaffe",
	    		"Bloc n� 1 � Support et mise � disposition de services informatiques\r\n" + 
	    		"G�rer le patrimoine informatique\r\n" + 
	    		"R�pondre aux incidents et aux demandes d�assistance et d��volution\r\n" + 
	    		"D�velopper la pr�sence en ligne de l�organisation \r\n" + 
	    		"Travailler en mode projet\r\n" + 
	    		"Mettre � disposition des utilisateurs un service informatique\r\n" + 
	    		"Organiser son d�veloppement professionnel", 
	    		68);
	    
	    Module adminReseau = new Module("Administration des syst�mes et des r�seaux", "Monsieur connect",
	    		"Concevoir une solution d�infrastructure r�seau\r\n" + 
	    		"Installer, tester et d�ployer une solution d�infrastructure r�seau\r\n" + 
	    		"Exploiter, d�panner et superviser une solution d�infrastructure r�seau", 
	    		92);
	    
	    Module dev = new Module("Conception et d�veloppement d�applications", "Monsoeur Geek",
	    		"Concevoir et d�velopper une solution applicative \r\n" + 
	    		"Assurer la maintenance corrective ou �volutive d�une solution applicative\r\n" + 
	    		"G�rer les donn�es", 
	    		98);
	    
	    Module cyber = new Module("Cybers�curit� des services informatiques", "Madame �thique",
	    		"Prot�ger les donn�es � caract�re personnel\r\n" + 
	    		"Pr�server l'identit� num�rique de l�organisation\r\n" + 
	    		"S�curiser les �quipements et les usages des utilisateurs \r\n" + 
	    		"Garantir la disponibilit�, l�int�grit� et  la confidentialit� des  services informatiques\r\n" + 
	    		"et des donn�es de l�organisation face � des cyberattaques\r\n" + 
	    		"Assurer la cybers�curit� d�une solution applicative et de son d�veloppement", 
	    		78);
	    
	    Module culture = new Module("culture g�n�rale et expression", "Andr� Malraux",
	    		"Communiquer par �crit :\r\n" + 
	    		"-      appr�hender et r�aliser un message �crit ;\r\n" + 
	    		"-      respecter les contraintes de la langue �crite ;\r\n" + 
	    		"-      synth�tiser  des  informations :  fid�lit�  �  la  signification  des  documents,  exactitude  et  pr�cision \r\n" + 
	    		"dans  leur  compr�hension  et  leur  mise  en  relation,  pertinence  des  choix  op�r�s  en  fonction  du \r\n" + 
	    		"probl�me pos� et de la probl�matique, coh�rence de la production ;\r\n" + 
	    		"-      r�pondre de fa�on argument�e � une question pos�e en relation avec les documents propos�s \r\n" + 
	    		"en lecture.\r\n" + 
	    		"Communiquer oralement :\r\n" + 
	    		"-      s�adapter � la situation : ma�trise des contraintes de temps, de lieu, d�objectifs et d�adaptation au \r\n" + 
	    		"destinataire,  choix  des  moyens  d�expression  appropri�s,  prise  en  compte  de  l�attitude  et  des \r\n" + 
	    		"questions du ou des interlocuteurs ;\r\n" + 
	    		"-      organiser un message oral : respect du sujet, structure interne du message.", 
	    		48);
	    
	    Module expressionAnglaise = new Module("expression et communication en langue anglaise", "Madame Birkin",
	    		"Niveau B2 du CECRL pour les activit�s langagi�res suivantes :\r\n" + 
	    		"-      compr�hension de documents �crits ;\r\n" + 
	    		"-      production et interaction �crites ;\r\n" + 
	    		"-      compr�hension de l�oral ;\r\n" + 
	    		"-      production et interaction orales.", 
	    		92);
	    
	    service.ajouterModuleFormation(math, "SLAM2");
	    service.ajouterModuleFormation(ecjma, "SLAM2");
	    service.ajouterModuleFormation(langue2, "SLAM2");
	    service.ajouterModuleFormation(serviceInfo, "SLAM2");
	    service.ajouterModuleFormation(dev, "SLAM2");
	    service.ajouterModuleFormation(cyber, "SLAM2");
	    
	    service.ajouterModuleFormation(mathAppro, "SISR2");
	    service.ajouterModuleFormation(adminReseau, "SISR2");
	    service.ajouterModuleFormation(culture, "SISR2");
	    service.ajouterModuleFormation(expressionAnglaise, "SISR2");
	    
	    

	}

}
