package org.example.qcm.dsl.generator;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.resource.ResourceSet;

import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import org.eclipse.emf.common.util.URI;

import org.eclipse.xtext.resource.XtextResource;

import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.Injector;

import org.example.qcm.dsl.QcmDslStandaloneSetup;

import java.io.IOException;



public class ModelInstanceExporter {

    public static void main(String[] args) throws IOException {

        // Initialiser Xtext

        Injector injector = new QcmDslStandaloneSetup().createInjectorAndDoEMFRegistration();

        ResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);



        // Charger le fichier conforme à la grammaire

        Resource resource = resourceSet.getResource(URI.createFileURI("E:\\Eclipse\\runtime-EclipseApplication\\test\\src\\test.qcm"), true);



        // Vérifiez que le fichier est bien chargé

        if (!resource.getContents().isEmpty() && resource instanceof XtextResource) {

            // Accédez à la racine de l'instance générée

            Object root = resource.getContents().get(0);



            // Sauvegardez l'instance dans un fichier XMI

            ResourceSet outputSet = new ResourceSetImpl();

            Resource outputResource = outputSet.createResource(URI.createFileURI("C:\\Users\\Hp\\eclipse-workspace\\QuestionnaireToPresentationQVT\\Questionnaire.xmi"));


            outputResource.getContents().add(resource.getContents().get(0));

            outputResource.save(null);



            System.out.println("Instance sauvegardée dans output.xmi");

        } else {

            System.err.println("Erreur : Impossible de charger le fichier .qcm");

        }

    }

}