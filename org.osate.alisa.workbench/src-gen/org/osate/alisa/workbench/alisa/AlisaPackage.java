/**
 */
package org.osate.alisa.workbench.alisa;

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
 * @see org.osate.alisa.workbench.alisa.AlisaFactory
 * @model kind="package"
 * @generated
 */
public interface AlisaPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "alisa";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.osate.org/alisa/workbench/Alisa";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "alisa";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  AlisaPackage eINSTANCE = org.osate.alisa.workbench.alisa.impl.AlisaPackageImpl.init();

  /**
   * The meta object id for the '{@link org.osate.alisa.workbench.alisa.impl.AlisaWorkAreaImpl <em>Work Area</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.alisa.workbench.alisa.impl.AlisaWorkAreaImpl
   * @see org.osate.alisa.workbench.alisa.impl.AlisaPackageImpl#getAlisaWorkArea()
   * @generated
   */
  int ALISA_WORK_AREA = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALISA_WORK_AREA__NAME = 0;

  /**
   * The feature id for the '<em><b>Cases</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALISA_WORK_AREA__CASES = 1;

  /**
   * The number of structural features of the '<em>Work Area</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALISA_WORK_AREA_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.osate.alisa.workbench.alisa.impl.AssuranceCasePlanImpl <em>Assurance Case Plan</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.alisa.workbench.alisa.impl.AssuranceCasePlanImpl
   * @see org.osate.alisa.workbench.alisa.impl.AlisaPackageImpl#getAssuranceCasePlan()
   * @generated
   */
  int ASSURANCE_CASE_PLAN = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSURANCE_CASE_PLAN__NAME = 0;

  /**
   * The feature id for the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSURANCE_CASE_PLAN__TITLE = 1;

  /**
   * The feature id for the '<em><b>System</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSURANCE_CASE_PLAN__SYSTEM = 2;

  /**
   * The feature id for the '<em><b>Description</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSURANCE_CASE_PLAN__DESCRIPTION = 3;

  /**
   * The feature id for the '<em><b>Constant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSURANCE_CASE_PLAN__CONSTANT = 4;

  /**
   * The feature id for the '<em><b>Plans</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSURANCE_CASE_PLAN__PLANS = 5;

  /**
   * The feature id for the '<em><b>Selection Filter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSURANCE_CASE_PLAN__SELECTION_FILTER = 6;

  /**
   * The number of structural features of the '<em>Assurance Case Plan</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSURANCE_CASE_PLAN_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link org.osate.alisa.workbench.alisa.impl.SelectionConditionExprImpl <em>Selection Condition Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.alisa.workbench.alisa.impl.SelectionConditionExprImpl
   * @see org.osate.alisa.workbench.alisa.impl.AlisaPackageImpl#getSelectionConditionExpr()
   * @generated
   */
  int SELECTION_CONDITION_EXPR = 2;

  /**
   * The number of structural features of the '<em>Selection Condition Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECTION_CONDITION_EXPR_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.osate.alisa.workbench.alisa.impl.SelectionCategoryReferenceImpl <em>Selection Category Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.alisa.workbench.alisa.impl.SelectionCategoryReferenceImpl
   * @see org.osate.alisa.workbench.alisa.impl.AlisaPackageImpl#getSelectionCategoryReference()
   * @generated
   */
  int SELECTION_CATEGORY_REFERENCE = 3;

  /**
   * The feature id for the '<em><b>Cat</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECTION_CATEGORY_REFERENCE__CAT = SELECTION_CONDITION_EXPR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Selection Category Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECTION_CATEGORY_REFERENCE_FEATURE_COUNT = SELECTION_CONDITION_EXPR_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.osate.alisa.workbench.alisa.impl.AndSelectionConditionExprImpl <em>And Selection Condition Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.alisa.workbench.alisa.impl.AndSelectionConditionExprImpl
   * @see org.osate.alisa.workbench.alisa.impl.AlisaPackageImpl#getAndSelectionConditionExpr()
   * @generated
   */
  int AND_SELECTION_CONDITION_EXPR = 4;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_SELECTION_CONDITION_EXPR__LEFT = SELECTION_CONDITION_EXPR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_SELECTION_CONDITION_EXPR__RIGHT = SELECTION_CONDITION_EXPR_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>And Selection Condition Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_SELECTION_CONDITION_EXPR_FEATURE_COUNT = SELECTION_CONDITION_EXPR_FEATURE_COUNT + 2;


  /**
   * Returns the meta object for class '{@link org.osate.alisa.workbench.alisa.AlisaWorkArea <em>Work Area</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Work Area</em>'.
   * @see org.osate.alisa.workbench.alisa.AlisaWorkArea
   * @generated
   */
  EClass getAlisaWorkArea();

  /**
   * Returns the meta object for the attribute '{@link org.osate.alisa.workbench.alisa.AlisaWorkArea#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.osate.alisa.workbench.alisa.AlisaWorkArea#getName()
   * @see #getAlisaWorkArea()
   * @generated
   */
  EAttribute getAlisaWorkArea_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.alisa.workbench.alisa.AlisaWorkArea#getCases <em>Cases</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Cases</em>'.
   * @see org.osate.alisa.workbench.alisa.AlisaWorkArea#getCases()
   * @see #getAlisaWorkArea()
   * @generated
   */
  EReference getAlisaWorkArea_Cases();

  /**
   * Returns the meta object for class '{@link org.osate.alisa.workbench.alisa.AssuranceCasePlan <em>Assurance Case Plan</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assurance Case Plan</em>'.
   * @see org.osate.alisa.workbench.alisa.AssuranceCasePlan
   * @generated
   */
  EClass getAssuranceCasePlan();

  /**
   * Returns the meta object for the attribute '{@link org.osate.alisa.workbench.alisa.AssuranceCasePlan#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.osate.alisa.workbench.alisa.AssuranceCasePlan#getName()
   * @see #getAssuranceCasePlan()
   * @generated
   */
  EAttribute getAssuranceCasePlan_Name();

  /**
   * Returns the meta object for the attribute '{@link org.osate.alisa.workbench.alisa.AssuranceCasePlan#getTitle <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Title</em>'.
   * @see org.osate.alisa.workbench.alisa.AssuranceCasePlan#getTitle()
   * @see #getAssuranceCasePlan()
   * @generated
   */
  EAttribute getAssuranceCasePlan_Title();

  /**
   * Returns the meta object for the reference '{@link org.osate.alisa.workbench.alisa.AssuranceCasePlan#getSystem <em>System</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>System</em>'.
   * @see org.osate.alisa.workbench.alisa.AssuranceCasePlan#getSystem()
   * @see #getAssuranceCasePlan()
   * @generated
   */
  EReference getAssuranceCasePlan_System();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.alisa.workbench.alisa.AssuranceCasePlan#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Description</em>'.
   * @see org.osate.alisa.workbench.alisa.AssuranceCasePlan#getDescription()
   * @see #getAssuranceCasePlan()
   * @generated
   */
  EReference getAssuranceCasePlan_Description();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.alisa.workbench.alisa.AssuranceCasePlan#getConstant <em>Constant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Constant</em>'.
   * @see org.osate.alisa.workbench.alisa.AssuranceCasePlan#getConstant()
   * @see #getAssuranceCasePlan()
   * @generated
   */
  EReference getAssuranceCasePlan_Constant();

  /**
   * Returns the meta object for the reference list '{@link org.osate.alisa.workbench.alisa.AssuranceCasePlan#getPlans <em>Plans</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Plans</em>'.
   * @see org.osate.alisa.workbench.alisa.AssuranceCasePlan#getPlans()
   * @see #getAssuranceCasePlan()
   * @generated
   */
  EReference getAssuranceCasePlan_Plans();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.alisa.workbench.alisa.AssuranceCasePlan#getSelectionFilter <em>Selection Filter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Selection Filter</em>'.
   * @see org.osate.alisa.workbench.alisa.AssuranceCasePlan#getSelectionFilter()
   * @see #getAssuranceCasePlan()
   * @generated
   */
  EReference getAssuranceCasePlan_SelectionFilter();

  /**
   * Returns the meta object for class '{@link org.osate.alisa.workbench.alisa.SelectionConditionExpr <em>Selection Condition Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Selection Condition Expr</em>'.
   * @see org.osate.alisa.workbench.alisa.SelectionConditionExpr
   * @generated
   */
  EClass getSelectionConditionExpr();

  /**
   * Returns the meta object for class '{@link org.osate.alisa.workbench.alisa.SelectionCategoryReference <em>Selection Category Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Selection Category Reference</em>'.
   * @see org.osate.alisa.workbench.alisa.SelectionCategoryReference
   * @generated
   */
  EClass getSelectionCategoryReference();

  /**
   * Returns the meta object for the reference '{@link org.osate.alisa.workbench.alisa.SelectionCategoryReference#getCat <em>Cat</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Cat</em>'.
   * @see org.osate.alisa.workbench.alisa.SelectionCategoryReference#getCat()
   * @see #getSelectionCategoryReference()
   * @generated
   */
  EReference getSelectionCategoryReference_Cat();

  /**
   * Returns the meta object for class '{@link org.osate.alisa.workbench.alisa.AndSelectionConditionExpr <em>And Selection Condition Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>And Selection Condition Expr</em>'.
   * @see org.osate.alisa.workbench.alisa.AndSelectionConditionExpr
   * @generated
   */
  EClass getAndSelectionConditionExpr();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.alisa.workbench.alisa.AndSelectionConditionExpr#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.osate.alisa.workbench.alisa.AndSelectionConditionExpr#getLeft()
   * @see #getAndSelectionConditionExpr()
   * @generated
   */
  EReference getAndSelectionConditionExpr_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.alisa.workbench.alisa.AndSelectionConditionExpr#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.osate.alisa.workbench.alisa.AndSelectionConditionExpr#getRight()
   * @see #getAndSelectionConditionExpr()
   * @generated
   */
  EReference getAndSelectionConditionExpr_Right();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  AlisaFactory getAlisaFactory();

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
     * The meta object literal for the '{@link org.osate.alisa.workbench.alisa.impl.AlisaWorkAreaImpl <em>Work Area</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.alisa.workbench.alisa.impl.AlisaWorkAreaImpl
     * @see org.osate.alisa.workbench.alisa.impl.AlisaPackageImpl#getAlisaWorkArea()
     * @generated
     */
    EClass ALISA_WORK_AREA = eINSTANCE.getAlisaWorkArea();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ALISA_WORK_AREA__NAME = eINSTANCE.getAlisaWorkArea_Name();

    /**
     * The meta object literal for the '<em><b>Cases</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ALISA_WORK_AREA__CASES = eINSTANCE.getAlisaWorkArea_Cases();

    /**
     * The meta object literal for the '{@link org.osate.alisa.workbench.alisa.impl.AssuranceCasePlanImpl <em>Assurance Case Plan</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.alisa.workbench.alisa.impl.AssuranceCasePlanImpl
     * @see org.osate.alisa.workbench.alisa.impl.AlisaPackageImpl#getAssuranceCasePlan()
     * @generated
     */
    EClass ASSURANCE_CASE_PLAN = eINSTANCE.getAssuranceCasePlan();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASSURANCE_CASE_PLAN__NAME = eINSTANCE.getAssuranceCasePlan_Name();

    /**
     * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASSURANCE_CASE_PLAN__TITLE = eINSTANCE.getAssuranceCasePlan_Title();

    /**
     * The meta object literal for the '<em><b>System</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSURANCE_CASE_PLAN__SYSTEM = eINSTANCE.getAssuranceCasePlan_System();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSURANCE_CASE_PLAN__DESCRIPTION = eINSTANCE.getAssuranceCasePlan_Description();

    /**
     * The meta object literal for the '<em><b>Constant</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSURANCE_CASE_PLAN__CONSTANT = eINSTANCE.getAssuranceCasePlan_Constant();

    /**
     * The meta object literal for the '<em><b>Plans</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSURANCE_CASE_PLAN__PLANS = eINSTANCE.getAssuranceCasePlan_Plans();

    /**
     * The meta object literal for the '<em><b>Selection Filter</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSURANCE_CASE_PLAN__SELECTION_FILTER = eINSTANCE.getAssuranceCasePlan_SelectionFilter();

    /**
     * The meta object literal for the '{@link org.osate.alisa.workbench.alisa.impl.SelectionConditionExprImpl <em>Selection Condition Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.alisa.workbench.alisa.impl.SelectionConditionExprImpl
     * @see org.osate.alisa.workbench.alisa.impl.AlisaPackageImpl#getSelectionConditionExpr()
     * @generated
     */
    EClass SELECTION_CONDITION_EXPR = eINSTANCE.getSelectionConditionExpr();

    /**
     * The meta object literal for the '{@link org.osate.alisa.workbench.alisa.impl.SelectionCategoryReferenceImpl <em>Selection Category Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.alisa.workbench.alisa.impl.SelectionCategoryReferenceImpl
     * @see org.osate.alisa.workbench.alisa.impl.AlisaPackageImpl#getSelectionCategoryReference()
     * @generated
     */
    EClass SELECTION_CATEGORY_REFERENCE = eINSTANCE.getSelectionCategoryReference();

    /**
     * The meta object literal for the '<em><b>Cat</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SELECTION_CATEGORY_REFERENCE__CAT = eINSTANCE.getSelectionCategoryReference_Cat();

    /**
     * The meta object literal for the '{@link org.osate.alisa.workbench.alisa.impl.AndSelectionConditionExprImpl <em>And Selection Condition Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.alisa.workbench.alisa.impl.AndSelectionConditionExprImpl
     * @see org.osate.alisa.workbench.alisa.impl.AlisaPackageImpl#getAndSelectionConditionExpr()
     * @generated
     */
    EClass AND_SELECTION_CONDITION_EXPR = eINSTANCE.getAndSelectionConditionExpr();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AND_SELECTION_CONDITION_EXPR__LEFT = eINSTANCE.getAndSelectionConditionExpr_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AND_SELECTION_CONDITION_EXPR__RIGHT = eINSTANCE.getAndSelectionConditionExpr_Right();

  }

} //AlisaPackage
