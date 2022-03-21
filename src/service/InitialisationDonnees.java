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
		Formation slam1 = new Formation("SLAM1", "Bts Sio SLAM première année",780);
	    slam1.setDescription(
	    		"	Participer à la production et à la fourniture de services en développant, en adaptant ou en maintenant des\r\n " +
	    		"	solutions applicatives.\n" +
	    	    "	Elle intervient plus particulièrement dans :\r\n" + 
	    		"	La définition des spécifications techniques à partir de l’expression des besoins des utilisateurs et des \r\n" +
	    	    "	contraintes de l’organisation préalablement recensés, notamment liées à la sécurité,\r\n" + 
	    		"	La réalisation, l’adaptation, la sécurisation puis la validation de solutions applicatives à l’aide des cadres \r\n" +
	    	    "	applicatifs (frameworks) retenus,\r\n" + 
	    		"	La gestion du patrimoine applicatif,\r\n" + 
	    		"	La rédaction de la documentation d’une solution applicative,\r\n" + 
	    		"	La recherche de réponses adaptées à des problèmes liés à la fourniture et à la sécurisation des services informatiques,\r\n" + 
	    		"	L’accompagnement et l’assistance des utilisateurs,\r\n" + 
	    		"	Le maintien de la qualité des services applicatifs.");
	    Formation slam2 = new Formation("SLAM2", "Bts Sio SLAM deuxiéme année", 890);
	    slam2.setDescription(
	    		"	Participer à la production et à la fourniture de services en développant, en adaptant ou en maintenant des solutions \n" +
	    		"	applicatives.\r\n " +
	    	    "	Elle intervient plus particulièrement dans :" + 
	    		"	La définition des spécifications techniques à partir de l’expression des besoins des utilisateurs et des contraintes\r\n" +
	    	    "	de l’organisation préalablement recensés,notamment liées à la sécurité\r\n" + 
	    		"	La réalisation, l’adaptation, la sécurisation puis la validation de solutions applicatives à l’aide des cadres\r\n" +
	    	    "	applicatifs (frameworks) retenus,\r\n" + 
	    		"	La gestion du patrimoine applicatif,\r\n" + 
	    		"	La rédaction de la documentation d’une solution applicative,\r\n" + 
	    		"	La recherche de réponses adaptées à des problèmes liés à la fourniture et à la sécurisation des services informatiques,\r\n" + 
	    		"	L’accompagnement et l’assistance des utilisateurs,\r\n" + 
	    		"	Le maintien de la qualité des services applicatifs.");
	    Formation sisr1 = new Formation("SISR1", "Bts Sio SISR première année", 780);
	    sisr1.setDescription(
	    		"    Participer à la production et à la fourniture de services en réalisant ou en adaptant des solutions d’infrastructure \r\n" +
	    		"    et en assurant le fonctionnement optimal des équipements et des services informatiques\r\n" + 
	    		"    Intervenir plus particulièrement dans : \r\n" + 
	    		"    L’installation, l’intégration, l’administration, la sécurisation des équipements et des services informatiques,\r\n" + 
	    		"    L’exploitation, la supervision et la maintenance d'une infrastructure systèmes et réseaux,\r\n" + 
	    		"    Le choix et la mise en œuvre de solutions d’hébergement,\r\n" + 
	    		"    La définition et la configuration des postes clients, des serveurs et des équipements d’interconnexion, leur déploiement \n" + 
	    		"    et leur maintenance.\r\n" + 
	    		"    La gestion des actifs de l’infrastructure,\r\n" + 
	    		"    La recherche de réponses adaptées à des besoins d’évolution de l’infrastructure ou à des problèmes liés à la mise à \n" + 
	    		"    disposition des services informatiques,\r\n" + 
	    		"    La résolution des incidents et l’assistance des utilisateurs,\r\n" + 
	    		"    Le maintien de la qualité des services informatiques,\r\n" + 
	    		"    La détection, la réaction et l’investigation pour donner suite à un incident de sécurité.\r\n");
	    Formation sisr2 = new Formation("SISR2", "Bts Sio SLAM deuxiéme année", 890);
	    sisr2.setDescription(
	    		"	Participer à la production et à la fourniture de services en réalisant \n" + 
	    		"	ou en adaptant des solutions d’infrastructure et en assurant le fonctionnement\n" +
	    		"	optimal des équipements et des services informatiques\r\n" + 
	    		"	Intervenir plus particulièrement dans : \r\n" + 
	    		"	L’installation, l’intégration, l’administration, la sécurisation des équipements \n" +
	    		"	et des services informatiques,\r\n" + 
	    		"	L’exploitation, la supervision et la maintenance d'une infrastructure systèmes et réseaux,\r\n" + 
	    		"	Le choix et la mise en œuvre de solutions d’hébergement,\r\n" + 
	    		"	La définition et la configuration des postes clients, des serveurs et des équipements d’interconnexion,\r\n" +
	    		"	leur déploiement et leur maintenance,\r\n" + 
	    		"	La gestion des actifs de l’infrastructure,\r\n" + 
	    		"	La recherche de réponses adaptées à des besoins d’évolution de l’infrastructure ou à des problèmes liés à \r\n" +
	    		"	la mise à disposition des services informatiques,\r\n" + 
	    		"	La résolution des incidents et l’assistance des utilisateurs,\r\n" + 
	    		"	Le maintien de la qualité des services informatiques,\r\n" + 
	    		"	La détection, la réaction et l’investigation pour donner suite à un incident de sécurité.\r\n");
	    Formation unum3 = new Formation("INUM3", "Ingénieur du numérique quatrième année", 840);
	    unum3.setDescription(
	    		"	L'ingénieur en électronique numérique conçoit des circuits imprimés, \n" + 
	    		"	utilisant des puces électroniques programmables et d'autres composants. \n" + 
	    		"	Ces montages électroniques se trouvent dans de nombreux produits et applications : \r\n" + 
	    		"	consoles de jeux, pass transport sans contact, drones, téléphones portables, etc. \r\n" + 
	    		"	Lors de la conception, il s'appuie sur un cahier des charges. \r\n" + 
	    		"	Il définit ensuite l'architecture matérielle et fonctionnelle de la partie numérique \r\n" + 
	    		"	du système électronique, puis il choisit les composants et détermine leur organisation.");
	    Formation unum4 = new Formation("INUM4", "Ingénieur du numérique quatrième année", 860);
	    unum4.setDescription(
	    		"	Les majeures proposées permettent de se spécialiser et d’approfondir \r\n" + 
	    		"	des compétences métiers (300h).\r\n" + 
	    		"	Cybersécurité et réseaux\r\n" + 
	    		"	Objets connectés et systèmes intelligents\r\n" + 
	    		"	Big Data & Data Science\r\n" + 
	    		"	Intelligence artificielle\r\n" + 
	    		"	Transition numérique");
	    Formation unum5 = new Formation("INUM5", "Ingénieur du numérique cinquième année", 560);
	    unum5.setDescription(
	    		"	Compétences acquises\r\n" + 
	    		"	Savoir mettre en œuvre un dispositif de réalité virtuelle et de réalité augmentée\r\n" + 
	    		"	Savoir mettre en œuvre une application permettant de répondre à un besoin industriel\r\n" + 
	    		"	Savoir mettre en œuvre un protocole expérimental de validation de méthodes et \r\n" +
	    		"	outils de réalité virtuelle/réalité augmentée (savoir développer une démarche scientifique).\r\n" + 
	    		"	Savoir développer et gérer un projet de recherche et développement, en lien \r\n" + 
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
	    Etudiant balzac = new Etudiant("De Balzac","honoré","15 rue de la rose 13013 Marseille", "0784675844", "balzac@mail.com"); 
	    Etudiant camus = new Etudiant("Camus","Albert","16 rue valentin 13013 Marseille", "0876574822", "camus@mail.com"); 
	    Etudiant zola = new Etudiant("Zola","Emile","12 rue du bonheur 13013 Marseille", "02468024", "zola@mail.com"); 
	    Etudiant sartre = new Etudiant("Sartre","Jean-Paul","69 rue du bocage 13013 Marseille", "0345678909", "sartre@mail.com"); 
	    Etudiant rabelais = new Etudiant("Rabelais","François","67 rue bovin 13013 Marseille", "08695847", "rabelais@mail.com"); 
	    Etudiant sand = new Etudiant("Sand","Goarges","26 rue castafiore 13013 Marseille", "0234567890", "sand@mail.com"); 
	    Etudiant shakespeare = new Etudiant("Shakespeare","William","14 rue de la soif 13013 Marseille", "0123456789", "shakespeare@mail.com"); 
	    Etudiant baudelaire = new Etudiant("Baudelaire","Charles","98 rue du palais 13013 Marseille", "0457382904", "baudelaire@mail.com");  
	    Etudiant dumas = new Etudiant("Dumas","Alexandre","46 rue de l'entrain 13013 Marseille", "0987654321", "dumas@mail.com"); 
	    Etudiant appolinaire = new Etudiant("Appolinaire","Guillaume","53 rue du retour 13013 Marseille", "0239467412", "appolinaire@mail.com"); 
	    Etudiant flaubert = new Etudiant("Flaubert","Gustave","58 rue druot 13013 Marseille", "04566783920", "flaubert@mail.com"); 
	    Etudiant rousseau = new Etudiant("Rousseau","Jean-Jacques","68 rue lindet 13013 Marseille", "0135860456", "rousseau@mail.com"); 
	    Etudiant yourcenar = new Etudiant("Yourcenar","Marguerite","35 rue de la pompe 13013 Marseille", "0192837465", "yourcenar@mail.com"); 
	    Etudiant eluard = new Etudiant("Eluard","Paul","90 rue du maréchal 13013 Marseille", "02938475610", "eluard@mail.com"); 
	    Etudiant aragon = new Etudiant("Aragon","Louis","56 rue sérénité 13013 Marseille", "0345678909", "maiga@mail.com"); 
	    Etudiant prevert = new Etudiant("Prévert","Jacques","96 rue du dépassement 13013 Marseille", "0695847362", "aragon@mail.com"); 
	    Etudiant desnos = new Etudiant("Desnos","Robert","63 rue de la renaissance 13013 Marseille", "0796859403", "desnos@mail.com"); 
	    Etudiant breton = new Etudiant("Breton","André","14 rue du coq 13013 Marseille", "0283745682", "breton@mail.com"); 
	    Etudiant queneau = new Etudiant("Queneau","Raymond","17 rue ariel 13013 Marseille", "0195738465", "queneau@mail.com"); 
	    Etudiant mercoeur = new Etudiant("Mercoeur","Elisa","26 rue dindon 13013 Marseille", "098049586", "mercoeur@mail.com"); 
	    Etudiant labe = new Etudiant("Labé","Louise","18 rue du chemin vert 13013 Marseille", "0493867244", "labe@mail.com"); 
	    Etudiant vivien = new Etudiant("Vivien","Renée","12 rue de la coulée rouge 13013 Marseille", "0691029384", "vivien@mail.com"); 
	    
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
	    
	    Module math = new Module("Mathématiques pour l’informatique", "Monsieur Thales",
	    		"Comprendre et  résoudre  les  problèmes  mathématiques  élémentaires  auxquels  une  personne \r\n" + 
	    		"informaticienne  est  couramment  confrontée  (calcul  binaire,  masque  de  réseau,  opérateurs \r\n" + 
	    		"logiques…)\r\n" + 
	    		"Comprendre et manipuler les objets mathématiques fréquemment utilisés en programmation, \r\n" + 
	    		"de manière à pouvoir exploiter informatiquement une  solution mathématique préalablement \r\n" + 
	    		"construite\r\n" + 
	    		"Résoudre  des  problèmes  numériques  nécessitant  la  mise  en  œuvre  d'algorithmes  qu'il  s'agit  de \r\n" + 
	    		"construire, de mettre en forme et dont on comparera éventuellement les performances", 
	    		84);
	    
	    Module ecjma = new Module("Culture économique, juridique et managériale", "Madame De Beauvoir",
	    		"Capacités à : \r\n" + 
	    		"-      analyser des situations auxquelles l’entreprise est confrontée ;\r\n" + 
	    		"-      exploiter une base documentaire économique, juridique ou managériale ;\r\n" + 
	    		"-      proposer   des   solutions   argumentées   et   mobilisant   des   notions   et   les   méthodologies \r\n" + 
	    		"économiques, juridiques ou managériales adaptées aux situations proposées ;\r\n" + 
	    		"-      établir un diagnostic (ou une partie de diagnostic) préparant une prise de décision stratégique ;\r\n" + 
	    		"-      exposer ses analyses et ses propositions de manière cohérente et argumentée.", 
	    		62);
	    
	    Module langue2 = new Module("Bloc facultatif - Langue vivante 2", "Madame Tatcher",
	    		"Niveau B1 du CECRL pour les activités langagières suivantes :\r\n" + 
	    		"-      compréhension de documents écrits ;\r\n" + 
	    		"-      production et interaction écrites ;\r\n" + 
	    		"-      compréhension de l’oral ;\r\n" + 
	    		"-      production et interaction orales.", 
	    		48);
	    
	    Module mathAppro = new Module("Mathématiques approfondies", "Georges Sand", 
	    		"Capacités à :\r\n" + 
	    		"-      s’informer sur les outils mathématiques ;\r\n" + 
	    		"-      chercher en utilisant les outils mathématiques ;\r\n" + 
	    		"-      raisonner et argumenter à l’aide d’outils mathématiques ;\r\n" + 
	    		"-      effectuer des calculs relevant des mathématiques approfondies avec une calculatrice et  d’autres \r\n" + 
	    		"moyens informatiques ;\r\n" + 
	    		"-      modéliser, interpréter et communiquer sur les résultats ainsi obtenus.", 
	    		82);
	    
	    Module serviceInfo = new Module("Support et mise à disposition de services informatiques", "Monsoeur Lagaffe",
	    		"Bloc n° 1 – Support et mise à disposition de services informatiques\r\n" + 
	    		"Gérer le patrimoine informatique\r\n" + 
	    		"Répondre aux incidents et aux demandes d’assistance et d’évolution\r\n" + 
	    		"Développer la présence en ligne de l’organisation \r\n" + 
	    		"Travailler en mode projet\r\n" + 
	    		"Mettre à disposition des utilisateurs un service informatique\r\n" + 
	    		"Organiser son développement professionnel", 
	    		68);
	    
	    Module adminReseau = new Module("Administration des systèmes et des réseaux", "Monsieur connect",
	    		"Concevoir une solution d’infrastructure réseau\r\n" + 
	    		"Installer, tester et déployer une solution d’infrastructure réseau\r\n" + 
	    		"Exploiter, dépanner et superviser une solution d’infrastructure réseau", 
	    		92);
	    
	    Module dev = new Module("Conception et développement d’applications", "Monsoeur Geek",
	    		"Concevoir et développer une solution applicative \r\n" + 
	    		"Assurer la maintenance corrective ou évolutive d’une solution applicative\r\n" + 
	    		"Gérer les données", 
	    		98);
	    
	    Module cyber = new Module("Cybersécurité des services informatiques", "Madame éthique",
	    		"Protéger les données à caractère personnel\r\n" + 
	    		"Préserver l'identité numérique de l’organisation\r\n" + 
	    		"Sécuriser les équipements et les usages des utilisateurs \r\n" + 
	    		"Garantir la disponibilité, l’intégrité et  la confidentialité des  services informatiques\r\n" + 
	    		"et des données de l’organisation face à des cyberattaques\r\n" + 
	    		"Assurer la cybersécurité d’une solution applicative et de son développement", 
	    		78);
	    
	    Module culture = new Module("culture générale et expression", "André Malraux",
	    		"Communiquer par écrit :\r\n" + 
	    		"-      appréhender et réaliser un message écrit ;\r\n" + 
	    		"-      respecter les contraintes de la langue écrite ;\r\n" + 
	    		"-      synthétiser  des  informations :  fidélité  à  la  signification  des  documents,  exactitude  et  précision \r\n" + 
	    		"dans  leur  compréhension  et  leur  mise  en  relation,  pertinence  des  choix  opérés  en  fonction  du \r\n" + 
	    		"problème posé et de la problématique, cohérence de la production ;\r\n" + 
	    		"-      répondre de façon argumentée à une question posée en relation avec les documents proposés \r\n" + 
	    		"en lecture.\r\n" + 
	    		"Communiquer oralement :\r\n" + 
	    		"-      s’adapter à la situation : maîtrise des contraintes de temps, de lieu, d’objectifs et d’adaptation au \r\n" + 
	    		"destinataire,  choix  des  moyens  d’expression  appropriés,  prise  en  compte  de  l’attitude  et  des \r\n" + 
	    		"questions du ou des interlocuteurs ;\r\n" + 
	    		"-      organiser un message oral : respect du sujet, structure interne du message.", 
	    		48);
	    
	    Module expressionAnglaise = new Module("expression et communication en langue anglaise", "Madame Birkin",
	    		"Niveau B2 du CECRL pour les activités langagières suivantes :\r\n" + 
	    		"-      compréhension de documents écrits ;\r\n" + 
	    		"-      production et interaction écrites ;\r\n" + 
	    		"-      compréhension de l’oral ;\r\n" + 
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
