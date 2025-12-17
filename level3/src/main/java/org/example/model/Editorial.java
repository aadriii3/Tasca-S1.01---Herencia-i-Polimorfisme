package org.example.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Editorial {

    private List<Editor> editorsList;
    private Scanner sc;

    public Editorial() {
        this.editorsList = new ArrayList<>();
        this.sc = new Scanner(System.in);
    }

    public void initEditorial(){
        int menuOption = 0;

        do {
            System.out.println("Introdueixi una opcio del menu: ");
            System.out.println("1. Introduir redactor\n2. Eliminar redactor\n3. Introduir noticia a un redactor\n4. Eliminar noticia\n5. Mostrar totes les noticies d'un redactor\n6. Calcular puntuacio d'una noticia\n7. Calcular preu d'una noticia\n8. Mostrar tots els redactors\n9. Sortir");
            menuOption = sc.nextInt();

            switch (menuOption){
                case 1:
                    addEditor();
                    break;
                case 2:
                    deleteEditor();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    for (Editor e : editorsList) {
                        System.out.println(e.toString());
                    }
                    break;
                case 9:
                    System.out.println("Sortint...");
                    break;
                default:
                    System.out.println("Introdueixi un numero que estigui a la llista");

            }

        }while(menuOption!= 9);

        System.out.println("Sortida amb exit");
    }

    private void addEditor(){
        sc.nextLine();
        System.out.println("Introudeix el DNI del redactor:");
        String dniEditor = sc.nextLine();
        System.out.println("Introdueixi el nom del redactor: ");
        String editorName = sc.nextLine();

        Editor editor = new Editor(dniEditor, editorName);
        editorsList.add(editor);
        System.out.println("Redactor afegit");
    }

    private void deleteEditor(){
        sc.nextLine();
        System.out.println("Introdueixi el DNI del redactor que vols eliminar: ");
        String deleteEditorDni = sc.nextLine();
        System.out.println("Introdueixi el nom del redactor que vols eliminar: ");
        String deleteEditorName = sc.nextLine();

        Editor deleteEditor = null;

        for (Editor e : editorsList) {
            if(e.getDni().equalsIgnoreCase(deleteEditorDni) && e.getName().equalsIgnoreCase(deleteEditorName)) {
                deleteEditor = e;
                break;
            }
        }

        if(deleteEditor != null){
            editorsList.remove(deleteEditor);
            System.out.println("Redactor eliminado");
        }else{
            System.out.println("Redactor no encontrado");
        }
    }

    public void addNewsEditor(){
        sc.nextLine();
        System.out.println("Introdueixi el DNI del redactor que vols afegir-li una noticia: ");
        String dniToAddNews = sc.nextLine();
        System.out.println("Introdueixi el nom del redactor que vols afegir-li una noticia: ");
        String nameToAddNews = sc.nextLine();

        Editor newsEditor = null;

        for (Editor e : editorsList) {
            if(e.getDni().equalsIgnoreCase(dniToAddNews) && e.getName().equalsIgnoreCase(nameToAddNews)) {
                newsEditor = e;
                break;
            }
        }

        if(newsEditor != null){
            String title;
            String text;
            int opcionNews;

            System.out.println("Afegeix un titol a la noticia:");
            title = sc.nextLine();
            System.out.println("Afegeix un text a la noticia:");
            text = sc.nextLine();

            System.out.println("De quin tipus es la noticia?");
            System.out.println("1.Football News\n2.Basketball News\n3.Tennis News\n4. F1 News\n5. Motorcycling News");
            opcionNews = sc.nextInt();

            switch (opcionNews) {
                case 1:

            }

        }
    }


}
