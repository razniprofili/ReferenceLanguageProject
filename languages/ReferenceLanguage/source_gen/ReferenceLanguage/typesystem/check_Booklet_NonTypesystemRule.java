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

public class check_Booklet_NonTypesystemRule extends AbstractNonTypesystemRule_Runtime implements NonTypesystemRule_Runtime {
  public check_Booklet_NonTypesystemRule() {
  }
  public void applyRule(final SNode booklet, final TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    if (isEmptyString(SPropertyOperations.getString(booklet, PROPS.title$lgmP))) {
      {
        final MessageTarget errorTarget = new NodeMessageTarget();
        IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(booklet, "Title could not be empty!", "r:43f71e48-a850-46da-878a-0fd5ec7107b1(ReferenceLanguage.typesystem)", "3888084304413376945", null, errorTarget);
      }
    }
  }
  public SAbstractConcept getApplicableConcept() {
    return CONCEPTS.Booklet$P8;
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
    /*package*/ static final SProperty title$lgmP = MetaAdapterFactory.getProperty(0x28685c99a6841f2L, 0x9f1069a76b1b1f42L, 0x1da23d5c1241dbeaL, 0x1da23d5c1241dbf1L, "title");
  }

  private static final class CONCEPTS {
    /*package*/ static final SConcept Booklet$P8 = MetaAdapterFactory.getConcept(0x28685c99a6841f2L, 0x9f1069a76b1b1f42L, 0x1da23d5c1241dbeaL, "ReferenceLanguage.structure.Booklet");
  }
}
