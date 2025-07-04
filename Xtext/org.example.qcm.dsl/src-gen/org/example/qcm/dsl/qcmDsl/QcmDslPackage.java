/**
 * generated by Xtext 2.37.0
 */
package org.example.qcm.dsl.qcmDsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.example.qcm.dsl.qcmDsl.QcmDslFactory
 * @model kind="package"
 * @generated
 */
public interface QcmDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "qcmDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.example.org/qcm/dsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "qcmDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  QcmDslPackage eINSTANCE = org.example.qcm.dsl.qcmDsl.impl.QcmDslPackageImpl.init();

  /**
   * The meta object id for the '{@link org.example.qcm.dsl.qcmDsl.impl.QuestionnaireImpl <em>Questionnaire</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.qcm.dsl.qcmDsl.impl.QuestionnaireImpl
   * @see org.example.qcm.dsl.qcmDsl.impl.QcmDslPackageImpl#getQuestionnaire()
   * @generated
   */
  int QUESTIONNAIRE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUESTIONNAIRE__NAME = 0;

  /**
   * The feature id for the '<em><b>Melange</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUESTIONNAIRE__MELANGE = 1;

  /**
   * The feature id for the '<em><b>Questions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUESTIONNAIRE__QUESTIONS = 2;

  /**
   * The number of structural features of the '<em>Questionnaire</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUESTIONNAIRE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.example.qcm.dsl.qcmDsl.impl.QuestionImpl <em>Question</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.qcm.dsl.qcmDsl.impl.QuestionImpl
   * @see org.example.qcm.dsl.qcmDsl.impl.QcmDslPackageImpl#getQuestion()
   * @generated
   */
  int QUESTION = 1;

  /**
   * The feature id for the '<em><b>Texte</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUESTION__TEXTE = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUESTION__TYPE = 1;

  /**
   * The feature id for the '<em><b>Difficulte</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUESTION__DIFFICULTE = 2;

  /**
   * The feature id for the '<em><b>Propositions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUESTION__PROPOSITIONS = 3;

  /**
   * The feature id for the '<em><b>Etiquettes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUESTION__ETIQUETTES = 4;

  /**
   * The number of structural features of the '<em>Question</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUESTION_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.example.qcm.dsl.qcmDsl.impl.PropositionImpl <em>Proposition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.qcm.dsl.qcmDsl.impl.PropositionImpl
   * @see org.example.qcm.dsl.qcmDsl.impl.QcmDslPackageImpl#getProposition()
   * @generated
   */
  int PROPOSITION = 2;

  /**
   * The feature id for the '<em><b>Texte</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPOSITION__TEXTE = 0;

  /**
   * The feature id for the '<em><b>Est Correcte</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPOSITION__EST_CORRECTE = 1;

  /**
   * The number of structural features of the '<em>Proposition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPOSITION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.example.qcm.dsl.qcmDsl.impl.EtiquetteImpl <em>Etiquette</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.qcm.dsl.qcmDsl.impl.EtiquetteImpl
   * @see org.example.qcm.dsl.qcmDsl.impl.QcmDslPackageImpl#getEtiquette()
   * @generated
   */
  int ETIQUETTE = 3;

  /**
   * The feature id for the '<em><b>Nom</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ETIQUETTE__NOM = 0;

  /**
   * The number of structural features of the '<em>Etiquette</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ETIQUETTE_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link org.example.qcm.dsl.qcmDsl.Questionnaire <em>Questionnaire</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Questionnaire</em>'.
   * @see org.example.qcm.dsl.qcmDsl.Questionnaire
   * @generated
   */
  EClass getQuestionnaire();

  /**
   * Returns the meta object for the attribute '{@link org.example.qcm.dsl.qcmDsl.Questionnaire#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.example.qcm.dsl.qcmDsl.Questionnaire#getName()
   * @see #getQuestionnaire()
   * @generated
   */
  EAttribute getQuestionnaire_Name();

  /**
   * Returns the meta object for the attribute '{@link org.example.qcm.dsl.qcmDsl.Questionnaire#getMelange <em>Melange</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Melange</em>'.
   * @see org.example.qcm.dsl.qcmDsl.Questionnaire#getMelange()
   * @see #getQuestionnaire()
   * @generated
   */
  EAttribute getQuestionnaire_Melange();

  /**
   * Returns the meta object for the containment reference list '{@link org.example.qcm.dsl.qcmDsl.Questionnaire#getQuestions <em>Questions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Questions</em>'.
   * @see org.example.qcm.dsl.qcmDsl.Questionnaire#getQuestions()
   * @see #getQuestionnaire()
   * @generated
   */
  EReference getQuestionnaire_Questions();

  /**
   * Returns the meta object for class '{@link org.example.qcm.dsl.qcmDsl.Question <em>Question</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Question</em>'.
   * @see org.example.qcm.dsl.qcmDsl.Question
   * @generated
   */
  EClass getQuestion();

  /**
   * Returns the meta object for the attribute '{@link org.example.qcm.dsl.qcmDsl.Question#getTexte <em>Texte</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Texte</em>'.
   * @see org.example.qcm.dsl.qcmDsl.Question#getTexte()
   * @see #getQuestion()
   * @generated
   */
  EAttribute getQuestion_Texte();

  /**
   * Returns the meta object for the attribute '{@link org.example.qcm.dsl.qcmDsl.Question#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.example.qcm.dsl.qcmDsl.Question#getType()
   * @see #getQuestion()
   * @generated
   */
  EAttribute getQuestion_Type();

  /**
   * Returns the meta object for the attribute '{@link org.example.qcm.dsl.qcmDsl.Question#getDifficulte <em>Difficulte</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Difficulte</em>'.
   * @see org.example.qcm.dsl.qcmDsl.Question#getDifficulte()
   * @see #getQuestion()
   * @generated
   */
  EAttribute getQuestion_Difficulte();

  /**
   * Returns the meta object for the containment reference list '{@link org.example.qcm.dsl.qcmDsl.Question#getPropositions <em>Propositions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Propositions</em>'.
   * @see org.example.qcm.dsl.qcmDsl.Question#getPropositions()
   * @see #getQuestion()
   * @generated
   */
  EReference getQuestion_Propositions();

  /**
   * Returns the meta object for the containment reference list '{@link org.example.qcm.dsl.qcmDsl.Question#getEtiquettes <em>Etiquettes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Etiquettes</em>'.
   * @see org.example.qcm.dsl.qcmDsl.Question#getEtiquettes()
   * @see #getQuestion()
   * @generated
   */
  EReference getQuestion_Etiquettes();

  /**
   * Returns the meta object for class '{@link org.example.qcm.dsl.qcmDsl.Proposition <em>Proposition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Proposition</em>'.
   * @see org.example.qcm.dsl.qcmDsl.Proposition
   * @generated
   */
  EClass getProposition();

  /**
   * Returns the meta object for the attribute '{@link org.example.qcm.dsl.qcmDsl.Proposition#getTexte <em>Texte</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Texte</em>'.
   * @see org.example.qcm.dsl.qcmDsl.Proposition#getTexte()
   * @see #getProposition()
   * @generated
   */
  EAttribute getProposition_Texte();

  /**
   * Returns the meta object for the attribute '{@link org.example.qcm.dsl.qcmDsl.Proposition#getEstCorrecte <em>Est Correcte</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Est Correcte</em>'.
   * @see org.example.qcm.dsl.qcmDsl.Proposition#getEstCorrecte()
   * @see #getProposition()
   * @generated
   */
  EAttribute getProposition_EstCorrecte();

  /**
   * Returns the meta object for class '{@link org.example.qcm.dsl.qcmDsl.Etiquette <em>Etiquette</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Etiquette</em>'.
   * @see org.example.qcm.dsl.qcmDsl.Etiquette
   * @generated
   */
  EClass getEtiquette();

  /**
   * Returns the meta object for the attribute '{@link org.example.qcm.dsl.qcmDsl.Etiquette#getNom <em>Nom</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nom</em>'.
   * @see org.example.qcm.dsl.qcmDsl.Etiquette#getNom()
   * @see #getEtiquette()
   * @generated
   */
  EAttribute getEtiquette_Nom();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  QcmDslFactory getQcmDslFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.example.qcm.dsl.qcmDsl.impl.QuestionnaireImpl <em>Questionnaire</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.qcm.dsl.qcmDsl.impl.QuestionnaireImpl
     * @see org.example.qcm.dsl.qcmDsl.impl.QcmDslPackageImpl#getQuestionnaire()
     * @generated
     */
    EClass QUESTIONNAIRE = eINSTANCE.getQuestionnaire();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUESTIONNAIRE__NAME = eINSTANCE.getQuestionnaire_Name();

    /**
     * The meta object literal for the '<em><b>Melange</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUESTIONNAIRE__MELANGE = eINSTANCE.getQuestionnaire_Melange();

    /**
     * The meta object literal for the '<em><b>Questions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUESTIONNAIRE__QUESTIONS = eINSTANCE.getQuestionnaire_Questions();

    /**
     * The meta object literal for the '{@link org.example.qcm.dsl.qcmDsl.impl.QuestionImpl <em>Question</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.qcm.dsl.qcmDsl.impl.QuestionImpl
     * @see org.example.qcm.dsl.qcmDsl.impl.QcmDslPackageImpl#getQuestion()
     * @generated
     */
    EClass QUESTION = eINSTANCE.getQuestion();

    /**
     * The meta object literal for the '<em><b>Texte</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUESTION__TEXTE = eINSTANCE.getQuestion_Texte();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUESTION__TYPE = eINSTANCE.getQuestion_Type();

    /**
     * The meta object literal for the '<em><b>Difficulte</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUESTION__DIFFICULTE = eINSTANCE.getQuestion_Difficulte();

    /**
     * The meta object literal for the '<em><b>Propositions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUESTION__PROPOSITIONS = eINSTANCE.getQuestion_Propositions();

    /**
     * The meta object literal for the '<em><b>Etiquettes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUESTION__ETIQUETTES = eINSTANCE.getQuestion_Etiquettes();

    /**
     * The meta object literal for the '{@link org.example.qcm.dsl.qcmDsl.impl.PropositionImpl <em>Proposition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.qcm.dsl.qcmDsl.impl.PropositionImpl
     * @see org.example.qcm.dsl.qcmDsl.impl.QcmDslPackageImpl#getProposition()
     * @generated
     */
    EClass PROPOSITION = eINSTANCE.getProposition();

    /**
     * The meta object literal for the '<em><b>Texte</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPOSITION__TEXTE = eINSTANCE.getProposition_Texte();

    /**
     * The meta object literal for the '<em><b>Est Correcte</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPOSITION__EST_CORRECTE = eINSTANCE.getProposition_EstCorrecte();

    /**
     * The meta object literal for the '{@link org.example.qcm.dsl.qcmDsl.impl.EtiquetteImpl <em>Etiquette</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.qcm.dsl.qcmDsl.impl.EtiquetteImpl
     * @see org.example.qcm.dsl.qcmDsl.impl.QcmDslPackageImpl#getEtiquette()
     * @generated
     */
    EClass ETIQUETTE = eINSTANCE.getEtiquette();

    /**
     * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ETIQUETTE__NOM = eINSTANCE.getEtiquette_Nom();

  }

} //QcmDslPackage
