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

public class check_InBook_NonTypesystemRule extends AbstractNonTypesystemRule_Runtime implements NonTypesystemRule_Runtime {
  public check_InBook_NonTypesystemRule() {
  }
  public void applyRule(final SNode inBook, final TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    if (isEmptyString(SPropertyOperations.getString(inBook, PROPS.bookTitle$6NnP))) {
      {
        final MessageTarget errorTarget = new NodeMessageTarget();
        IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(inBook, "Book title could not be empty", "r:43f71e48-a850-46da-878a-0fd5ec7107b1(ReferenceLanguage.typesystem)", "2178515694384904545", null, errorTarget);
      }
    }
    if (isEmptyString(SPropertyOperations.getString(inBook, PROPS.title$6MEM))) {
      {
        final MessageTarget errorTarget = new NodeMessageTarget();
        IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(inBook, "Title could not be empty", "r:43f71e48-a850-46da-878a-0fd5ec7107b1(ReferenceLanguage.typesystem)", "2178515694384908479", null, errorTarget);
      }
    }
    if (isEmptyString(SPropertyOperations.getString(inBook, PROPS.publisher$6V7m))) {
      {
        final MessageTarget errorTarget = new NodeMessageTarget();
        IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(inBook, "Publisher could not be empty!", "r:43f71e48-a850-46da-878a-0fd5ec7107b1(ReferenceLanguage.typesystem)", "2178515694384912856", null, errorTarget);
      }
    }
    if (SPropertyOperations.getInteger(inBook, PROPS.year$6Tuf) == 0) {
      {
        final MessageTarget errorTarget = new NodeMessageTarget();
        IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(inBook, "Year could not be empty", "r:43f71e48-a850-46da-878a-0fd5ec7107b1(ReferenceLanguage.typesystem)", "2178515694384923120", null, errorTarget);
      }
    }

  }
  public SAbstractConcept getApplicableConcept() {
    return CONCEPTS.InBook$Va;
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
    /*package*/ static final SProperty bookTitle$6NnP = MetaAdapterFactory.getProperty(0x28685c99a6841f2L, 0x9f1069a76b1b1f42L, 0x1a03dc0acd30fc2eL, 0x1a03dc0acd30fc35L, "bookTitle");
    /*package*/ static final SProperty title$6MEM = MetaAdapterFactory.getProperty(0x28685c99a6841f2L, 0x9f1069a76b1b1f42L, 0x1a03dc0acd30fc2eL, 0x1a03dc0acd30fc32L, "title");
    /*package*/ static final SProperty publisher$6V7m = MetaAdapterFactory.getProperty(0x28685c99a6841f2L, 0x9f1069a76b1b1f42L, 0x1a03dc0acd30fc2eL, 0x1a03dc0acd30fc41L, "publisher");
    /*package*/ static final SProperty year$6Tuf = MetaAdapterFactory.getProperty(0x28685c99a6841f2L, 0x9f1069a76b1b1f42L, 0x1a03dc0acd30fc2eL, 0x1a03dc0acd30fc3aL, "year");
  }

  private static final class CONCEPTS {
    /*package*/ static final SConcept InBook$Va = MetaAdapterFactory.getConcept(0x28685c99a6841f2L, 0x9f1069a76b1b1f42L, 0x1a03dc0acd30fc2eL, "ReferenceLanguage.structure.InBook");
  }
}
