/**
 * generated by Xtext 2.37.0
 */
package org.example.qcm.dsl.qcmDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Question</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.example.qcm.dsl.qcmDsl.Question#getTexte <em>Texte</em>}</li>
 *   <li>{@link org.example.qcm.dsl.qcmDsl.Question#getType <em>Type</em>}</li>
 *   <li>{@link org.example.qcm.dsl.qcmDsl.Question#getDifficulte <em>Difficulte</em>}</li>
 *   <li>{@link org.example.qcm.dsl.qcmDsl.Question#getPropositions <em>Propositions</em>}</li>
 *   <li>{@link org.example.qcm.dsl.qcmDsl.Question#getEtiquettes <em>Etiquettes</em>}</li>
 * </ul>
 *
 * @see org.example.qcm.dsl.qcmDsl.QcmDslPackage#getQuestion()
 * @model
 * @generated
 */
public interface Question extends EObject
{
  /**
   * Returns the value of the '<em><b>Texte</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Texte</em>' attribute.
   * @see #setTexte(String)
   * @see org.example.qcm.dsl.qcmDsl.QcmDslPackage#getQuestion_Texte()
   * @model
   * @generated
   */
  String getTexte();

  /**
   * Sets the value of the '{@link org.example.qcm.dsl.qcmDsl.Question#getTexte <em>Texte</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Texte</em>' attribute.
   * @see #getTexte()
   * @generated
   */
  void setTexte(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see #setType(String)
   * @see org.example.qcm.dsl.qcmDsl.QcmDslPackage#getQuestion_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link org.example.qcm.dsl.qcmDsl.Question#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

  /**
   * Returns the value of the '<em><b>Difficulte</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Difficulte</em>' attribute.
   * @see #setDifficulte(int)
   * @see org.example.qcm.dsl.qcmDsl.QcmDslPackage#getQuestion_Difficulte()
   * @model
   * @generated
   */
  int getDifficulte();

  /**
   * Sets the value of the '{@link org.example.qcm.dsl.qcmDsl.Question#getDifficulte <em>Difficulte</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Difficulte</em>' attribute.
   * @see #getDifficulte()
   * @generated
   */
  void setDifficulte(int value);

  /**
   * Returns the value of the '<em><b>Propositions</b></em>' containment reference list.
   * The list contents are of type {@link org.example.qcm.dsl.qcmDsl.Proposition}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Propositions</em>' containment reference list.
   * @see org.example.qcm.dsl.qcmDsl.QcmDslPackage#getQuestion_Propositions()
   * @model containment="true"
   * @generated
   */
  EList<Proposition> getPropositions();

  /**
   * Returns the value of the '<em><b>Etiquettes</b></em>' containment reference list.
   * The list contents are of type {@link org.example.qcm.dsl.qcmDsl.Etiquette}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Etiquettes</em>' containment reference list.
   * @see org.example.qcm.dsl.qcmDsl.QcmDslPackage#getQuestion_Etiquettes()
   * @model containment="true"
   * @generated
   */
  EList<Etiquette> getEtiquettes();

} // Question
