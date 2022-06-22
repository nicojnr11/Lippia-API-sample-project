package api.config;

import api.model.ErrorResponse;
import services.*;

public enum EntityConfiguration {

    USER {
        @Override
        public Class<?> getEntityService() {
            return UserService.class;
        }

    },
    RESPONSE_HEADERS {
        @Override
        public Class<?> getEntityService() {
            return ResponseHeadersService.class;
        }
    },
    WORKSPACE {
        @Override
        public Class<?> getEntityService() {
            return WorkspaceService.class;
        }
    },
    PROJECT {
        @Override
        public Class<?> getEntityService() {
            return ProjectService.class;
        }
    },
    ERROR {
        @Override
        public Class<?> getEntityService() {
            return ErrorService.class;
        }
    },
    PROJECTBYID {
        @Override
        public Class<?> getEntityService() { return ProjectByIdService.class; }
    },
    UPDATEPROJECTBYID {
        @Override
        public Class<?> getEntityService() { return UpdateProjectByIdService.class; }
    },
    GET_TIME_ENTRY {
        @Override
        public Class<?> getEntityService() { return GetTimeEntryService.class; }
    },
    ADD_TIME_ENTRY {
        @Override
        public Class<?> getEntityService() { return AddTimeEntryService.class; }
    },
    UPDATE_TIME_ENTRY {
        @Override
        public Class<?> getEntityService() { return UpdateTimeEntryService.class; }
    },DELETE_TIME_ENTRY {
        @Override
        public Class<?> getEntityService() { return DeleteTimeEntryService.class; }
    };

    public abstract Class<?> getEntityService();
}
