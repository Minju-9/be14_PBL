package class3.policy;

import class3.role.Role;

public class LionSubmissionPolicy implements SubmissionPolicy {

    @Override
    public boolean canSubmit() {
        return true;
    }
}