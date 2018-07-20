/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   main.cpp
 * Author: Naycene Boussoffara
 *
 * Created on 30 avril 2017, 19:43
 */

#include <cstdlib>
#include <string>
#include <stdlib.h>
#include <stdio.h>
#include <conio.h>
#include <iostream>
#include "Classe.h"
using namespace std;


int main() {
    const char ch[]="M";
    Etudiant E("esm",3);
    cout << "Creation d'un objet Etudiant E" << endl;
    E.saisie();
    cout << "Affichage de l'etudiant E:" << endl;
    E.affichage();
    E.moyenne();
    E.admis();
    Etudiant E1;
    E1.setNom(ch);
    E1.getNom();
    return 0;
}


