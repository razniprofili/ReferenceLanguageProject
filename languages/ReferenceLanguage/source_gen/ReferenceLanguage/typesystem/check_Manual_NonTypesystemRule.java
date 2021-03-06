package ReferenceLanguage.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractNonTypesystemRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.NonTypesystemRule_Runtime;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.errors.messageTargets.MessageTarget;
import jetbrains.mps.errors.messageTargets.NodeMessageTarget;
import jetbrains.mps.errors.IErrorReporter;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import org.jetbrains.mps.openapi.language.SProperty;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import org.jetbrains.mps.openapi.language.SConcept;

public class check_Manual_NonTypesystemRule extends AbstractNonTypesystemRule_Runtime implements NonTypesystemRule_Runtime {
  public check_Manual_NonTypesystemRule() {
  }
  public void applyRule(final SNode manual, final TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    if (isEmptyString(SPropertyOperations.getString(manual, PROPS.title$vshL))) {
      {
        final MessageTarget errorTarget = new NodeMessageTarget();
        IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(manual, "Title could not be empty!", "r:43f71e48-a850-46da-878a-0fd5ec7107b1(ReferenceLanguage.typesystem)", "3662926481594721605", null, errorTarget);
      }
    }
    if (SPropertyOperations.getInteger(manual, PROPS.year$vzkf) == 0) {
      {
        final MessageTarget errorTarget = new NodeMessageTarget();
        IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(manual, "Year could not be empty!", "r:43f71e48-a850-46da-878a-0fd5ec7107b1(ReferenceLanguage.typesystem)", "2432563194114851056", null, errorTarget);
      }
    }
  }
  public SAbstractConcept getApplicableConcept() {
    return CONCEPTS.Manual$eQ;
  }
  public IsApplicableStatus isApplicableAndPattern(SNode argument) {
    return new IsApplicableStatus(argument.getConcept().isSubConceptOf(getApplicableConcept()), null);
  }
  public boolean overrides() {
    return false;
  }
  private static boolean isEmptyString(String str) {
    return str == null || str.isEmpty();
  }

  private static final class PROPS {
    /*package*/ static final SProperty title$vshL = MetaAdapterFactory.getProperty(0x28685c99a6841f2L, 0x9f1069a76b1b1f42L, 0x536290f98ef226c3L, 0x536290f98ef226c6L, "title");
    /*package*/ static final SProperty year$vzkf = MetaAdapterFactory.getProperty(0x28685c99a6841f2L, 0x9f1069a76b1b1f42L, 0x536290f98ef226c3L, 0x536290f98ef226cfL, "year");
  }

  private static final class CONCEPTS {
    /*package*/ static final SConcept Manual$eQ = MetaAdapterFactory.getConcept(0x28685c99a6841f2L, 0x9f1069a76b1b1f42L, 0x536290f98ef226c3L, "ReferenceLanguage.structure.Manual");
  }
}
